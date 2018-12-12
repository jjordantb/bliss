package io.paratek;

import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;
import jdk.internal.org.objectweb.asm.commons.Remapper;
import jdk.internal.org.objectweb.asm.commons.RemappingClassAdapter;
import jdk.internal.org.objectweb.asm.commons.RemappingFieldAdapter;
import jdk.internal.org.objectweb.asm.commons.SimpleRemapper;
import jdk.internal.org.objectweb.asm.tree.*;

import java.io.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import java.util.zip.ZipEntry;

public class Deobfuscator {

    public static void main(String[] args) throws IOException {


        final FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\Parametric\\Desktop\\BlissScapeClient.jar"));
        final Map<String, ClassNode> nodeMap = load(fileInputStream);

        for (ClassNode classNode : nodeMap.values()) {
            for (MethodNode methodNode : classNode.methods) {
                final ListIterator<AbstractInsnNode> listIterator = methodNode.instructions.iterator();
                while (listIterator.hasNext()) {
                    AbstractInsnNode cur = listIterator.next();
                    if (cur instanceof MethodInsnNode && ((MethodInsnNode) cur).owner.equals("I/I") && ((MethodInsnNode) cur).name.equals("I")
                            && ((MethodInsnNode) cur).desc.equals("(I)Ljava/lang/String;")) {
                        int op = 0;
                        if ((cur.getPrevious().getOpcode() == Opcodes.SIPUSH || cur.getPrevious().getOpcode() == Opcodes.BIPUSH)) {
                            cur = listIterator.previous().getPrevious(); // get the sipush
                            op = ((IntInsnNode) cur).operand;
                        } else if (cur.getPrevious().getOpcode() == Opcodes.ICONST_M1){
                            cur = listIterator.previous().getPrevious(); // get the sipush
                            op = -1;
                        } else if (cur.getPrevious().getOpcode() == Opcodes.ICONST_0) {
                            cur = listIterator.previous().getPrevious(); // get the sipush
                            op = 0;
                        } else if (cur.getPrevious().getOpcode() == Opcodes.ICONST_1) {
                            cur = listIterator.previous().getPrevious(); // get the sipush
                            op = 1;
                        } else if (cur.getPrevious().getOpcode() == Opcodes.ICONST_2) {
                            cur = listIterator.previous().getPrevious(); // get the sipush
                            op = 2;
                        } else if (cur.getPrevious().getOpcode() == Opcodes.ICONST_3) {
                            cur = listIterator.previous().getPrevious(); // get the sipush
                            op = 3;
                        } else if (cur.getPrevious().getOpcode() == Opcodes.ICONST_4) {
                            cur = listIterator.previous().getPrevious(); // get the sipush
                            op = 4;
                        } else if (cur.getPrevious().getOpcode() == Opcodes.ICONST_5) {
                            cur = listIterator.previous().getPrevious(); // get the sipush
                            op = 5;
                        }
                        String val = I.I(op);
                        listIterator.previous();
                        listIterator.remove();
                        listIterator.next();
                        listIterator.remove();
                        listIterator.add(new LdcInsnNode(val));
                    }
                }
            }
        }

        final HashMap<String, ClassNode> newNodes = new HashMap<>();
//        final Map<String, Map<String, String>> fieldMappings = generateFieldMappings(nodeMap);
        final Remapper classRemapper = new SimpleRemapper(generateClassMappings(nodeMap));

        for (ClassNode classNode : nodeMap.values()) {
            ClassNode copy = new ClassNode();
            RemappingClassAdapter adapter = new RemappingClassAdapter(copy, classRemapper);
            classNode.accept(adapter);

            newNodes.put(copy.name, copy);
        }

        dumpJar(newNodes, "C:\\Users\\Parametric\\Desktop\\BlissStrings.jar");
    }

    private static Map<String, String> generateClassMappings(final Map<String, ClassNode> nodeMap) {
        final Map<String, String> nameMappings = new HashMap<>();
        int cnt = 0;
        for (String name : nodeMap.keySet()) {
            if (name.equals("Loader") || name.contains("/")) {
                continue;
            }
            if (name.equals("XEI")) {
                nameMappings.put(name, "client");
            } else {
                nameMappings.put(name, "class" + cnt++);
            }
        }
        return nameMappings;
    }

    private static Map<String, Map<String, String>> generateFieldMappings(final Map<String, ClassNode> nodeMap) {
        final Map<String, Map<String, String>> mappings = new HashMap<>();
        int cnt = 0;
        for (ClassNode classNode : nodeMap.values()) {
            if (classNode.name.equals("Loader") || classNode.name.contains("/")) {
                continue;
            }
            final Map<String, String> fieldMappings = new HashMap<>();
            for (FieldNode fieldNode : classNode.fields) {
                fieldMappings.put(fieldNode.name, "field" + cnt++);
            }
            mappings.put(classNode.name, fieldMappings);
        }
        return mappings;
    }

    private static Map<String, ClassNode> load(final InputStream inputStream) throws IOException {
        final Map<String, ClassNode> nodeMap = new HashMap<>();
        final JarInputStream inStream = new JarInputStream(inputStream);
        JarEntry entry;
        while ((entry = inStream.getNextJarEntry()) != null) {
            if (entry.getName().endsWith(".class")) {

                final ClassReader classReader = new ClassReader(inStream);
                final ClassNode classNode = new ClassNode();
                classReader.accept(classNode, 0);

                nodeMap.put(entry.getName().replace(".class", "").replace("/", "."), classNode);
            }

            inStream.closeEntry();
        }
        inStream.close();
        return nodeMap;
    }

    public static void dumpJar(final Map<String, ClassNode> classNodeMap, final String fileName) {
        try {
            JarOutputStream out = new JarOutputStream(new FileOutputStream(fileName));
            for (ClassNode cn : classNodeMap.values()) {
                ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
                cn.accept(cw);
                out.putNextEntry(new ZipEntry(cn.name + ".class"));
                out.write(cw.toByteArray());
                out.closeEntry();
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

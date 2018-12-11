package io.paratek;

import io.paratek.mapping.Class;
import io.paratek.mapping.Field;
import io.paratek.mapping.Method;
import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;
import jdk.internal.org.objectweb.asm.tree.*;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import java.util.zip.ZipEntry;

public class Deob {

    public static void main(String[] args) throws IOException {

        final FileInputStream fileInputStream = new FileInputStream(new File("/home/jordan/Desktop/BlissScapeClient.jar"));
        final HashMap<String, ClassNode> nodeMap = new HashMap<>();
        load(fileInputStream, nodeMap);

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
        int clsCnt = 0;
        int fieldCnt = 0;
        int methodCnt = 0;

        final HashMap<String, Class> mappedClasses = new HashMap<>();

        for (ClassNode classNode : nodeMap.values()) {
            if (classNode.name.contains("/")) {
                continue;
            }
            final Class clazz = new Class(classNode.name, classNode.name.equals("XEI") ? "client" : "class" + clsCnt++);
            if ((classNode.access & Opcodes.ACC_INTERFACE) != 0) {
                for (MethodNode methodNode : classNode.methods) {
                    final Method method = new Method(classNode.name, methodNode.name, methodNode.desc, "method" + methodCnt++);
                    method.setVirtual(true);
                    clazz.getMethods().put(methodNode.name, method);
                }
            } else if ((classNode.access & Opcodes.ACC_ABSTRACT) != 0) {
                for (MethodNode methodNode : classNode.methods) {
                    final Method method = new Method(classNode.name, methodNode.name, methodNode.desc, "method" + methodCnt++);
                    if ((methodNode.access & Opcodes.ACC_ABSTRACT) != 0) {
                        method.setVirtual(true);
                    }
                    clazz.getMethods().put(methodNode.name, method);
                }
            } else {
                // Check for superClass and interface methods then link them up
                for (MethodNode methodNode : classNode.methods) {
                    final Method method = new Method(classNode.name, methodNode.name, methodNode.desc, "method" + methodCnt++);
                    clazz.getMethods().put(methodNode.name, method);
                }
            }
            for (FieldNode fieldNode : classNode.fields) {
                final Field field = new Field(classNode.name, fieldNode.name, fieldNode.desc, "field" + fieldCnt++);
                clazz.getFields().put(fieldNode.name, field);
            }
            mappedClasses.put(classNode.name, clazz);
        }

        for (ClassNode classNode : nodeMap.values()) {
            if (classNode.name.contains("/")) {
                continue;
            }
            final Class child = mappedClasses.get(classNode.name);
            for (String itf : classNode.interfaces) {
                final Class mappedItf = mappedClasses.get(itf);
                child.getInterfaces().put(itf, mappedItf);
            }
            if (mappedClasses.containsKey(classNode.superName)) {
                child.setSuperClass(mappedClasses.get(classNode.superName));
            }
        }

        for (ClassNode classNode : nodeMap.values()) {
            if (classNode.name.contains("/")) {
                continue;
            }
            final Class mappedClass = mappedClasses.get(classNode.name);
            classNode.name = mappedClass.getUnique();
            if (mappedClasses.containsKey(classNode.superName)) {
                classNode.superName = mappedClass.getUnique();
            }
            List<String> interfaces = classNode.interfaces;
            for (int i = 0; i < interfaces.size(); i++) {
                String itf = interfaces.get(i);
                if (mappedClasses.containsKey(itf)) {
                    classNode.interfaces.set(i, mappedClasses.get(itf).getUnique());
                }
            }
            for (FieldNode fieldNode : classNode.fields) {
                final Field field = mappedClass.getFields().get(fieldNode.name);
                fieldNode.name = field.getUnique();
                if (mappedClasses.containsKey(field.getDescName())) {
                    fieldNode.desc = fieldNode.desc.replace(field.getDescName(), mappedClasses.get(field.getDescName()).getUnique());
                }
            }
            for (MethodNode methodNode : classNode.methods) {
                final Method method = mappedClass.getMethods().get(methodNode.name);
                methodNode.name = method.getUnique();
                // Need to fix desc
            }
        }

        // Go through methods, replace FieldInsnNodes, MethodInsnNodes, TypeInsnNodes

        dumpJar(nodeMap, "/home/jordan/Desktop/deobed.jar");
    }

    private static void load(final InputStream inputStream, final HashMap<String, ClassNode> nodeMap) throws IOException {
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

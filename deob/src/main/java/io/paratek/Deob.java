package io.paratek;

import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;
import jdk.internal.org.objectweb.asm.tree.*;

import java.io.*;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import java.util.zip.ZipEntry;

public class Deob {

    public static void main(String[] args) throws IOException {

        final FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\Parametric\\Desktop\\BlissScapeClient.jar"));
        final HashMap<String, ClassNode> nodeMap = new HashMap<String, ClassNode>();
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
                        System.out.println(op);
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

        dumpJar(nodeMap, "C:\\Users\\Parametric\\Desktop\\test.jar");
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

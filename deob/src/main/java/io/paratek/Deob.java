package io.paratek;

import io.paratek.mapping.Class;
import io.paratek.mapping.DualNode;
import io.paratek.mapping.Field;
import io.paratek.mapping.Method;
import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;
import jdk.internal.org.objectweb.asm.Type;
import jdk.internal.org.objectweb.asm.tree.*;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
            if (classNode.name.contains("/") || classNode.name.equals("Loader")) {
                continue;
            }
            final Class clazz = new Class(classNode.name, classNode.name.equals("XEI") ? "client" : "class" + clsCnt++);
            if (classNode.name.contains("Exception")) {
                System.out.println(classNode.name + " -> " + clazz.getUnique());
            }
            if ((classNode.access & Opcodes.ACC_INTERFACE) != 0) {
                for (MethodNode methodNode : classNode.methods) {
                    if (methodNode.name.contains("init")) {
                        continue;
                    }
                    final Method method = new Method(classNode.name, methodNode.name, methodNode.desc, methodNode.name);
                    method.setVirtual(true);
                    clazz.getMethods().put(new DualNode(methodNode.name, methodNode.desc), method);
                }
            } else if ((classNode.access & Opcodes.ACC_ABSTRACT) != 0) {
                for (MethodNode methodNode : classNode.methods) {
                    final Method method = new Method(classNode.name, methodNode.name, methodNode.desc, methodNode.name);
                    if ((methodNode.access & Opcodes.ACC_ABSTRACT) != 0) {
                        method.setVirtual(true);
                    }
                    clazz.getMethods().put(new DualNode(methodNode.name, methodNode.desc), method);
                }
            }
            for (FieldNode fieldNode : classNode.fields) {
                final Field field = new Field(classNode.name, fieldNode.name, fieldNode.desc, "field" + fieldCnt++);
                clazz.getFields().put(fieldNode.name, field);
            }
            mappedClasses.put(classNode.name, clazz);
        }

        for (ClassNode classNode : nodeMap.values()) {
            if (classNode.name.contains("/") || classNode.name.equals("Loader")) {
                continue;
            }
            final Class currentClass = mappedClasses.get(classNode.name);
            if (mappedClasses.containsKey(classNode.superName)) {
                final Class superClass = mappedClasses.get(classNode.superName);
                checkMethods(classNode, currentClass, superClass);
            }
            for (String itf : classNode.interfaces) {
                final Class itfClass = mappedClasses.get(itf);
                if (itfClass != null) {
                    checkMethods(classNode, currentClass, itfClass);
                }
            }
            for (MethodNode methodNode : classNode.methods) {
                if (!currentClass.getMethods().containsKey(new DualNode(methodNode.name, methodNode.desc))) {
                    final Method method = new Method(classNode.name, methodNode.name, methodNode.desc, methodNode.name);
                    currentClass.getMethods().put(new DualNode(methodNode.name, methodNode.desc), method);
                }
            }
        }

        for (ClassNode classNode : nodeMap.values()) {
            if (classNode.name.contains("/") || classNode.name.equals("Loader")) {
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
            if (classNode.name.contains("/") || classNode.name.equals("Loader")) {
                continue;
            }
            final Class mappedClass = mappedClasses.get(classNode.name);
            classNode.name = mappedClass.getUnique();
            if (mappedClasses.containsKey(classNode.superName)) {
                final Class mappedSuper = mappedClasses.get(classNode.superName);
                classNode.superName = mappedSuper.getUnique();
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
                if (mappedClasses.containsKey(field.getDescName()) && fieldNode.desc.contains(";")) {
                    final Pattern pattern = Pattern.compile("L(.+?);");
                    final Matcher matcher = pattern.matcher(fieldNode.desc);
                    while (matcher.find()) {
                        String val = matcher.group(1);
                        if (mappedClasses.containsKey(val)) {
                            fieldNode.desc = fieldNode.desc.replace("L" + val + ";", "L" + mappedClasses.get(val).getUnique() + ";");
                        }
                    }
                }
            }
            for (MethodNode methodNode : classNode.methods) {
                final Method method = mappedClass.getMethods().get(new DualNode(methodNode.name, methodNode.desc));
                if (!methodNode.name.contains("init")) {
//                    methodNode.name = method.getUnique();
                }
                final Pattern pattern = Pattern.compile("L(.+?);");
                final Matcher matcher = pattern.matcher(methodNode.desc);
                while (matcher.find()) {
                    String val = matcher.group(1);
                    if (mappedClasses.containsKey(val)) {
                        methodNode.desc = methodNode.desc.replace("L" + val + ";", "L" + mappedClasses.get(val).getUnique() + ";");
                    }
                }
                for (TryCatchBlockNode node : methodNode.tryCatchBlocks) {
                    if (mappedClasses.containsKey(node.type)) {
                        node.type = mappedClasses.get(node.type).getUnique();
                    }
                }
                List<String> exceptions = methodNode.exceptions;
                for (int i = 0; i < exceptions.size(); i++) {
                    String except = exceptions.get(i);
                    if (mappedClasses.containsKey(except)) {
                        exceptions.set(i, mappedClasses.get(except).getUnique());
                    }
                }
            }
        }

        for (ClassNode classNode : nodeMap.values()) {
            for (MethodNode methodNode : classNode.methods) {
                final ListIterator<AbstractInsnNode> nodeListIterator = methodNode.instructions.iterator();
                while (nodeListIterator.hasNext()) {
                    final AbstractInsnNode cur = nodeListIterator.next();
                    if (cur instanceof FieldInsnNode) {
                        // Description
                        final Pattern pattern = Pattern.compile("L(.+?);");
                        final Matcher matcher = pattern.matcher(((FieldInsnNode) cur).desc);
                        while (matcher.find()) {
                            String val = matcher.group(1);
                            if (mappedClasses.containsKey(val)) {
                                ((FieldInsnNode) cur).desc = ((FieldInsnNode) cur).desc.replace("L" + val + ";", "L" + mappedClasses.get(val).getUnique() + ";");
                            }
                        }
                        // Name and Owner
                        if (mappedClasses.containsKey(((FieldInsnNode) cur).owner)) {
                            final Class mappedClass = mappedClasses.get(((FieldInsnNode) cur).owner);
                            ((FieldInsnNode) cur).owner = mappedClass.getUnique();
                            if (mappedClass.getFields().containsKey(((FieldInsnNode) cur).name)) {
                                ((FieldInsnNode) cur).name = mappedClass.getFields().get(((FieldInsnNode) cur).name).getUnique();
                            } else {
                                // check super class
                                Class superClass = mappedClass.getSuperClass();
                                if (superClass.getFields().containsKey(((FieldInsnNode) cur).name)) {
                                    ((FieldInsnNode) cur).name = superClass.getFields().get(((FieldInsnNode) cur).name).getUnique();
                                } else {
                                    superClass = superClass.getSuperClass();
                                    if (superClass.getFields().containsKey(((FieldInsnNode) cur).name)) {
                                        ((FieldInsnNode) cur).name = superClass.getFields().get(((FieldInsnNode) cur).name).getUnique();
                                    } else {
                                        superClass = superClass.getSuperClass();
                                        if (superClass.getFields().containsKey(((FieldInsnNode) cur).name)) {
                                            ((FieldInsnNode) cur).name = superClass.getFields().get(((FieldInsnNode) cur).name).getUnique();
                                        } else {
                                            superClass = superClass.getSuperClass();
                                            if (superClass.getFields().containsKey(((FieldInsnNode) cur).name)) {
                                                ((FieldInsnNode) cur).name = superClass.getFields().get(((FieldInsnNode) cur).name).getUnique();
                                            } else {
                                                superClass = superClass.getSuperClass();
                                                if (superClass.getFields().containsKey(((FieldInsnNode) cur).name)) {
                                                    ((FieldInsnNode) cur).name = superClass.getFields().get(((FieldInsnNode) cur).name).getUnique();
                                                } else {
                                                    superClass = superClass.getSuperClass();
                                                    if (superClass.getFields().containsKey(((FieldInsnNode) cur).name)) {
                                                        ((FieldInsnNode) cur).name = superClass.getFields().get(((FieldInsnNode) cur).name).getUnique();
                                                    }
                                                    System.out.println(((FieldInsnNode) cur).name);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (cur instanceof MethodInsnNode) {
                        // Name and Owner
                        if (mappedClasses.containsKey(((MethodInsnNode) cur).owner)) {
                            final Class mappedClass = mappedClasses.get(((MethodInsnNode) cur).owner);
                            ((MethodInsnNode) cur).owner = mappedClass.getUnique();
                            if (mappedClass.getMethods().containsKey(new DualNode(((MethodInsnNode) cur).name, ((MethodInsnNode) cur).desc))) {
                                if (!((MethodInsnNode) cur).name.contains("init")) {
                                    ((MethodInsnNode) cur).name = mappedClass.getMethods().get(new DualNode(((MethodInsnNode) cur).name, ((MethodInsnNode) cur).desc)).getUnique();
                                }
                            }
                        }
                        // Description
                        final Pattern pattern = Pattern.compile("L(.+?);");
                        final Matcher matcher = pattern.matcher(((MethodInsnNode) cur).desc);
                        while (matcher.find()) {
                            String val = matcher.group(1);
                            if (mappedClasses.containsKey(val)) {
                                ((MethodInsnNode) cur).desc = ((MethodInsnNode) cur).desc.replace("L" + val + ";",
                                        "L" + mappedClasses.get(val).getUnique() + ";");
                            }
                        }
                    } else if (cur instanceof TypeInsnNode) {
                        // Description
                        if (((TypeInsnNode) cur).desc.contains("[") && !((TypeInsnNode) cur).desc.contains(";")) {
                            continue;
                        }
                        String val = ((TypeInsnNode) cur).desc.replaceAll("\\[", "");
                        if (!val.contains("/") && !val.contains("Loader")) {
                            if (val.contains(";")) {
                                val = val.replace("L", "").replace(";", "");
                            }
                            ((TypeInsnNode) cur).desc = ((TypeInsnNode) cur).desc.replace(val, mappedClasses.get(val).getUnique());
                        }
                    } else if (cur instanceof MultiANewArrayInsnNode) {
                        // Description
                        if (((MultiANewArrayInsnNode) cur).desc.contains("[") && !((MultiANewArrayInsnNode) cur).desc.contains(";")) {
                            continue;
                        }
                        String val = ((MultiANewArrayInsnNode) cur).desc.replaceAll("\\[", "");
                        if (!val.contains("/") && !val.contains("Loader")) {
                            if (val.contains(";")) {
                                val = val.replace("L", "").replace(";", "");
                            }
                            ((MultiANewArrayInsnNode) cur).desc = ((MultiANewArrayInsnNode) cur).desc.replace(val, mappedClasses.get(val).getUnique());
                        }
                    } else if (cur instanceof LdcInsnNode && ((LdcInsnNode) cur).cst instanceof Type) {
                        String val = ((Type) ((LdcInsnNode) cur).cst).getClassName().replaceAll("\\[", "");
                        if (!val.contains(".") && !val.contains("Loader")) {
                            if (val.contains(";")) {
                                val = val.replace("L", "").replace(";", "");
                            }
                            if (mappedClasses.containsKey(val)) {
                                ((LdcInsnNode) cur).cst = Type.getType("L" + mappedClasses.get(val).getUnique() + ";");
                            }
                        }
                    }
                }
            }
        }
        // Go through methods, replace FieldInsnNodes, MethodInsnNodes, TypeInsnNodes

        dumpJar(nodeMap, "/home/jordan/Desktop/deobed.jar");
    }

    private static void checkMethods(ClassNode classNode, Class currentClass, Class itfClass) {
        for (MethodNode methodNode : classNode.methods) {
            if (itfClass.getMethods().containsKey(new DualNode(methodNode.name, methodNode.desc))) {
                currentClass.getMethods().put(new DualNode(methodNode.name, methodNode.desc), itfClass.getMethods().get(new DualNode(methodNode.name, methodNode.desc)));
            }
        }
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

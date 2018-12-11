package io.paratek.mapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Class {

    private Class superClass = null;

    private final String name, unique;

    private final HashMap<String, Field> fields = new HashMap<>();
    private final HashMap<DualNode, Method> methods = new HashMap<>();
    private final HashMap<String, Class> interfaces = new HashMap<>();

    public Class(String name, String unique) {
        this.name = name;
        this.unique = unique;
    }

    public String getName() {
        return name;
    }

    public String getUnique() {
        return unique;
    }

    public Class getSuperClass() {
        return superClass;
    }

    public HashMap<String, Field>getFields() {
        return fields;
    }

    public HashMap<DualNode, Method> getMethods() {
        return methods;
    }

    public HashMap<String, Class> getInterfaces() {
        return interfaces;
    }

    public void setSuperClass(Class superClass) {
        this.superClass = superClass;
    }

    @Override
    public String toString() {
        return "Class{" +
                "superClass=" + superClass +
                ", name='" + name + '\'' +
                ", unique='" + unique + '\'' +
                ", fields=" + fields +
                ", methods=" + methods +
                ", interfaces=" + interfaces +
                '}';
    }
}

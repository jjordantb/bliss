package io.paratek.mapping;

import java.util.ArrayList;
import java.util.List;

public class Class {

    private final String name, unique;
    private final List<Field> fields = new ArrayList<>();
    private final List<Method> methods = new ArrayList<>();

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

    public List<Field> getFields() {
        return fields;
    }

    public List<Method> getMethods() {
        return methods;
    }

}

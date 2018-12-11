package io.paratek.mapping;

public class Field implements Nameable {

    private final String owner, name, desc, unique;

    public Field(String owner, String name, String desc, String unique) {
        this.owner = owner;
        this.name = name;
        this.desc = desc;
        this.unique = unique;
    }

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public String getUnique() {
        return unique;
    }

}

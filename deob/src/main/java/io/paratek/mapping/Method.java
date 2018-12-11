package io.paratek.mapping;

public class Method implements Nameable {

    private boolean virtual = false;
    private final String owner, name, desc, unique;

    public Method(String owner, String name, String desc, String unique) {
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

    public boolean isVirtual() {
        return virtual;
    }

    public void setVirtual(boolean virtual) {
        this.virtual = virtual;
    }

    @Override
    public String toString() {
        return "Method{" +
                "virtual=" + virtual +
                ", owner='" + owner + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", unique='" + unique + '\'' +
                '}';
    }
}

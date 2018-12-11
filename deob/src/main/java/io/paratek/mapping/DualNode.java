package io.paratek.mapping;

import java.util.Objects;

public class DualNode {

    private final String name, desc;

    public DualNode(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DualNode dualNode = (DualNode) o;
        return name.equals(dualNode.name) &&
                desc.equals(dualNode.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, desc);
    }

}

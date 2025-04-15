package com.xworkz.Objects.internal;

public class Bridge {
    private String name;
    private char type;
    private int length;

    public Bridge(String name, char type, int length) {
        this.name = name;
        this.type = type;
        this.length = length;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Bridge) {
                System.out.println("Object is an instance of Bridge");
                Bridge other = (Bridge) obj;
                if (this.name.equals(other.name)) {
                    System.out.println("Both Bridge are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bridge [name=" + name + ", type=" + type + ", length=" + length + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 18;
    }
}

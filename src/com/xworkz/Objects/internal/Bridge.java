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
    public String toString() {
        return "Bridge [name=" + name + ", type=" + type + ", length=" + length + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 18;
    }
}

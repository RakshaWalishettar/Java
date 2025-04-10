package com.xworkz.Objects.internal;

public class Festival {
    private String name;
    private char type;
    private int days;

    public Festival(String name, char type, int days) {
        this.name = name;
        this.type = type;
        this.days = days;
    }

    @Override
    public String toString() {
        return "Festival [name=" + name + ", type=" + type + ", days=" + days + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 40;
    }
}

package com.xworkz.Objects.internal;

public class Garden {
    private String name;
    private char type;
    private int plants;

    public Garden(String name, char type, int plants) {
        this.name = name;
        this.type = type;
        this.plants = plants;
    }

    @Override
    public String toString() {
        return "Garden [name=" + name + ", type=" + type + ", plants=" + plants + "]";
    }
}

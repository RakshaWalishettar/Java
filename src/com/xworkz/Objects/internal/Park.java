package com.xworkz.Objects.internal;

public class Park {
    private String name;
    private char type;
    private int area;

    public Park(String name, char type, int area) {
        this.name = name;
        this.type = type;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Park [name=" + name + ", type=" + type + ", area=" + area + "]";
    }
}

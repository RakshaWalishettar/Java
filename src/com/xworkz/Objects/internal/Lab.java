package com.xworkz.Objects.internal;

public class Lab {
    private String name;
    private char category;
    private int equipment;

    public Lab(String name, char category, int equipment) {
        this.name = name;
        this.category = category;
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "Lab [name=" + name + ", category=" + category + ", equipment=" + equipment + "]";
    }
}

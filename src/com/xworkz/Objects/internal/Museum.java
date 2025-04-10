package com.xworkz.Objects.internal;

public class Museum {
    private String name;
    private char section;
    private int exhibits;

    public Museum(String name, char section, int exhibits) {
        this.name = name;
        this.section = section;
        this.exhibits = exhibits;
    }

    @Override
    public String toString() {
        return "Museum [name=" + name + ", section=" + section + ", exhibits=" + exhibits + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 50;
    }
}

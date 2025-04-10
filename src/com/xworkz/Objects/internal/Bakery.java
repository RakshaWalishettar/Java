package com.xworkz.Objects.internal;

public class Bakery {
    private String name;
    private char specialty;
    private int items;

    public Bakery(String name, char specialty, int items) {
        this.name = name;
        this.specialty = specialty;
        this.items = items;
    }

    @Override
    public String toString() {
        return "Bakery [name=" + name + ", specialty=" + specialty + ", items=" + items + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 8;
    }
}

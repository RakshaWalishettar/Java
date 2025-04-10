package com.xworkz.Objects.internal;

public class ConventionCenter {
    private String name;
    private char hall;
    private int capacity;

    public ConventionCenter(String name, char hall, int capacity) {
        this.name = name;
        this.hall = hall;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "ConventionCenter [name=" + name + ", hall=" + hall + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 28;
    }
}

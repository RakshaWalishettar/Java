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
}

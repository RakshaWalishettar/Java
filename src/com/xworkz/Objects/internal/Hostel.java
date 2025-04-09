package com.xworkz.Objects.internal;

public class Hostel {
    private String name;
    private char type;
    private int capacity;

    public Hostel(String name, char type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Hostel [name=" + name + ", type=" + type + ", capacity=" + capacity + "]";
    }
}

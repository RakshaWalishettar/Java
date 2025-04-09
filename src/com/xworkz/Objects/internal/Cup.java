package com.xworkz.Objects.internal;

public class Cup {
    private String material;
    private char size;
    private int capacity;

    public Cup(String material, char size, int capacity) {
        this.material = material;
        this.size = size;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Cup [material=" + material + ", size=" + size + ", capacity=" + capacity + "]";
    }
}

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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Cup) {
                System.out.println("Object is an instance of cup");
                Cup other = (Cup) obj;
                if (this.material.equals(other.material)) {
                    System.out.println("Both cup are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cup [material=" + material + ", size=" + size + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 30;
    }
}

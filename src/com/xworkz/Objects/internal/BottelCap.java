package com.xworkz.Objects.internal;

public class BottelCap {
    private String material;
    private char shape;
    private int diameter;

    public BottelCap(String material, char shape, int diameter) {
        this.material = material;
        this.shape = shape;
        this.diameter = diameter;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof BottelCap) {
                System.out.println("Object is an instance of AP");
                BottelCap other = (BottelCap) obj;
                if (this.material.equals(other.material)) {
                    System.out.println("Both Park are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "BottleCap [material=" + material + ", shape=" + shape + ", diameter=" + diameter + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 16;
    }
}

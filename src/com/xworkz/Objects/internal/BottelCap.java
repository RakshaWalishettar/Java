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
    public String toString() {
        return "BottleCap [material=" + material + ", shape=" + shape + ", diameter=" + diameter + "]";
    }
}

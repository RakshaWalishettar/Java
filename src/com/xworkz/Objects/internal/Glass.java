package com.xworkz.Objects.internal;

public class Glass {
    private String shape;
    private char thickness;
    private int price;

    public Glass(String shape, char thickness, int price) {
        this.shape = shape;
        this.thickness = thickness;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Glass [shape=" + shape + ", thickness=" + thickness + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 44;
    }
}

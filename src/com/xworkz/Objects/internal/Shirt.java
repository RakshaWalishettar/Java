package com.xworkz.Objects.internal;

public class Shirt {
    private String color;
    private char size;
    private int price;

    public Shirt(String color, char size, int price) {
        this.color = color;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shirt [color=" + color + ", size=" + size + ", price=" + price + "]";
    }
}

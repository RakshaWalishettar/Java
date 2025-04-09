package com.xworkz.Objects.internal;

public class Bag {
    private String color;
    private char size;
    private int price;

    public Bag(String color, char size, int price) {
        this.color = color;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bag [color=" + color + ", size=" + size + ", price=" + price + "]";
    }

}

package com.xworkz.Objects.internal;

public class Brush {
    private String type;
    private char quality;
    private int price;

    public Brush(String type, char quality, int price) {
        this.type = type;
        this.quality = quality;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brush [type=" + type + ", quality=" + quality + ", price=" + price + "]";
    }
}

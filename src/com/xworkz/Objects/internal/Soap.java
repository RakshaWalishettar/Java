package com.xworkz.Objects.internal;

public class Soap {
    private String fragrance;
    private char quality;
    private int price;

    public Soap(String fragrance, char quality, int price) {
        this.fragrance = fragrance;
        this.quality = quality;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Soap [fragrance=" + fragrance + ", quality=" + quality + ", price=" + price + "]";
    }
}

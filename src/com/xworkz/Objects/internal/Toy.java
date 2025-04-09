package com.xworkz.Objects.internal;

public class Toy {
    private String type;
    private char colorCode;
    private int price;

    public Toy(String type, char colorCode, int price) {
        this.type = type;
        this.colorCode = colorCode;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toy [type=" + type + ", colorCode=" + colorCode + ", price=" + price + "]";
    }
}

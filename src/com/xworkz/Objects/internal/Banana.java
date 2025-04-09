package com.xworkz.Objects.internal;

public class Banana {
    private String type;
    private char level;
    private int price;

    public Banana(String type, char level, int price) {
        this.type = type;
        this.level = level;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Banana [type=" + type + ", level=" + level + ", price=" + price + "]";
    }
}

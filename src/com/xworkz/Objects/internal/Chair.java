package com.xworkz.Objects.internal;

public class Chair {
    private String type;
    private char level;
    private int price;

    public Chair(String type, char level, int price) {
        this.type = type;
        this.level = level;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chair [type=" + type + ", level=" + level + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 26;
    }
}

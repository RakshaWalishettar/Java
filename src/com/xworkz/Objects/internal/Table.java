package com.xworkz.Objects.internal;

public class Table {
    private String type;
    private char level;
    private int price;

    public Table(String type, char level, int price) {
        this.type = type;
        this.level = level;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Table [type=" + type + ", level=" + level + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -25;
    }
}

package com.xworkz.Objects.internal;

public class RemoteCover {
    private String material;
    private char colorCode;
    private int price;

    public RemoteCover(String material, char colorCode, int price) {
        this.material = material;
        this.colorCode = colorCode;
        this.price = price;
    }

    @Override
    public String toString() {
        return "RemoteCover [material=" + material + ", colorCode=" + colorCode + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 50;
    }
}

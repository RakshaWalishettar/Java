package com.xworkz.Objects.internal;

public class Mouse {
    private String brand;
    private char dpiLevel;
    private int price;

    public Mouse(String brand, char dpiLevel, int price) {
        this.brand = brand;
        this.dpiLevel = dpiLevel;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mouse [brand=" + brand + ", dpiLevel=" + dpiLevel + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -40;
    }
}

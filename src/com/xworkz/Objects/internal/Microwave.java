package com.xworkz.Objects.internal;

public class Microwave {
    private String brand;
    private char feature;
    private int wattage;

    public Microwave(String brand, char feature, int wattage) {
        this.brand = brand;
        this.feature = feature;
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Microwave [brand=" + brand + ", feature=" + feature + ", wattage=" + wattage + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -42;
    }
}

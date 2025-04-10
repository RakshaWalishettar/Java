package com.xworkz.Objects.internal;

public class Juicer {
    private String brand;
    private char bladeType;
    private int speedLevels;

    public Juicer(String brand, char bladeType, int speedLevels) {
        this.brand = brand;
        this.bladeType = bladeType;
        this.speedLevels = speedLevels;
    }

    @Override
    public String toString() {
        return "Juicer [brand=" + brand + ", bladeType=" + bladeType + ", speedLevels=" + speedLevels + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 50;
    }
}

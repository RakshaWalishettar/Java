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
}

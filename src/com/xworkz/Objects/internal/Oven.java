package com.xworkz.Objects.internal;

public class Oven {
    private String brand;
    private char fuelType;
    private int volume;

    public Oven(String brand, char fuelType, int volume) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Oven [brand=" + brand + ", fuelType=" + fuelType + ", volume=" + volume + "]";
    }
}

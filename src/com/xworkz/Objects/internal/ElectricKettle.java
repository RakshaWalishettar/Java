package com.xworkz.Objects.internal;

public class ElectricKettle {
    private String brand;
    private char material;
    private int capacity;

    public ElectricKettle(String brand, char material, int capacity) {
        this.brand = brand;
        this.material = material;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "ElectricKettle [brand=" + brand + ", material=" + material + ", capacity=" + capacity + "]";
    }
}

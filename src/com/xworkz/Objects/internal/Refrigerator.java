package com.xworkz.Objects.internal;

public class Refrigerator {
    private String brand;
    private char energyRating;
    private int capacity;

    public Refrigerator(String brand, char energyRating, int capacity) {
        this.brand = brand;
        this.energyRating = energyRating;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Refrigerator [brand=" + brand + ", energyRating=" + energyRating + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 50;
    }
}

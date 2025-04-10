package com.xworkz.Objects.internal;

public class Toaster {
    private String brand;
    private char slots;
    private int wattage;

    public Toaster(String brand, char slots, int wattage) {
        this.brand = brand;
        this.slots = slots;
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Toaster [brand=" + brand + ", slots=" + slots + ", wattage=" + wattage + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 50;
    }
}

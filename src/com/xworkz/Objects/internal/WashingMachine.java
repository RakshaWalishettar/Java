package com.xworkz.Objects.internal;

public class WashingMachine {
    private String brand;
    private char loadType;
    private int capacity;

    public WashingMachine(String brand, char loadType, int capacity) {
        this.brand = brand;
        this.loadType = loadType;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "WashingMachine [brand=" + brand + ", loadType=" + loadType + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -4;
    }

}

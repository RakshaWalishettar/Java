package com.xworkz.Objects.internal;

public class WaterPurifier {
    private String brand;
    private char filterType;
    private int tankCapacity;

    public WaterPurifier(String brand, char filterType, int tankCapacity) {
        this.brand = brand;
        this.filterType = filterType;
        this.tankCapacity = tankCapacity;
    }

    @Override
    public String toString() {
        return "WaterPurifier [brand=" + brand + ", filterType=" + filterType + ", tankCapacity=" + tankCapacity + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 50;
    }
}

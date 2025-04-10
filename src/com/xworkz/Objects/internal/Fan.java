package com.xworkz.Objects.internal;

public class Fan {
    private String brand;
    private int speedLevels;
    private boolean hasRemote;

    public Fan(String brand, int speedLevels, boolean hasRemote) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.hasRemote = hasRemote;
    }

    @Override
    public String toString() {
        return "Fan [brand=" + brand + ", speedLevels=" + speedLevels + ", hasRemote=" + hasRemote + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 37;
    }
}

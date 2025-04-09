package com.xworkz.Objects.internal;

public class SmartWatch {
    private String brand;
    private char displayType;
    private int batteryHours;

    public SmartWatch(String brand, char displayType, int batteryHours) {
        this.brand = brand;
        this.displayType = displayType;
        this.batteryHours = batteryHours;
    }

    @Override
    public String toString() {
        return "SmartWatch [brand=" + brand + ", displayType=" + displayType + ", batteryHours=" + batteryHours + "]";
    }
}

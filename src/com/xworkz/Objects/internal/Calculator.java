package com.xworkz.Objects.internal;

public class Calculator {
    private String brand;
    private char modelCode;
    private int batteryLife;

    public Calculator(String brand, char modelCode, int batteryLife) {
        this.brand = brand;
        this.modelCode = modelCode;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Calculator [brand=" + brand + ", modelCode=" + modelCode + ", batteryLife=" + batteryLife + "]";
    }
}

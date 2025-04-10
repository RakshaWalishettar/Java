package com.xworkz.Objects.internal;

import java.util.Objects;

public class AirConditioner {
    private String brand;
    private char coolingType;
    private int tonnage;

    public AirConditioner(String brand, char coolingType, int tonnage) {
        this.brand = brand;
        this.coolingType = coolingType;
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "AirConditioner [brand=" + brand + ", coolingType=" + coolingType + ", tonnage=" + tonnage + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 001;
    }

}

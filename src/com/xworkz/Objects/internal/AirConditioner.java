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

    public String getBrand() {
        return brand;
    }

    public char getCoolingType() {
        return coolingType;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCoolingType(char coolingType) {
        this.coolingType = coolingType;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }
   @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof AirConditioner) {
                System.out.println("Object is an instance of AC");
                AirConditioner other = (AirConditioner) obj;
                if (this.brand.equals(other.brand)) {
                    System.out.println("Both AC are the same");
                    return true;
                }
            }
        }
        return false;
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

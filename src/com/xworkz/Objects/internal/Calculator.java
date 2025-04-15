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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Calculator) {
                System.out.println("Object is an instance of calculator");
                Calculator other = (Calculator) obj;
                if (this.brand.equals(other.brand)) {
                    System.out.println("Both calculator are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Calculator [brand=" + brand + ", modelCode=" + modelCode + ", batteryLife=" + batteryLife + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 22;
    }
}

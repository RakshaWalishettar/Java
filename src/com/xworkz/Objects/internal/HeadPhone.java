package com.xworkz.Objects.internal;

public class HeadPhone {
    private String brand;
    private char connectivity;
    private int batteryLife;

    public HeadPhone(String brand, char connectivity, int batteryLife) {
        this.brand = brand;
        this.connectivity = connectivity;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Headphones [brand=" + brand + ", connectivity=" + connectivity + ", batteryLife=" + batteryLife + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 46;
    }
}

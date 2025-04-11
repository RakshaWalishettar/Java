package com.xworkz.Objects.internal;

public class VacuumCleaner {
    private String brand;
    private char mode;
    private int power;

    public VacuumCleaner(String brand, char mode, int power) {
        this.brand = brand;
        this.mode = mode;
        this.power = power;
    }

    @Override
    public String toString() {
        return "VacuumCleaner [brand=" + brand + ", mode=" + mode + ", power=" + power + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -7;
    }

}

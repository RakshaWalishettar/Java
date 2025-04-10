package com.xworkz.Objects.internal;

public class Laptop {
    private String brand;
    private char grade;
    private int cost;

    public Laptop(String brand, char grade, int cost) {
        this.brand = brand;
        this.grade = grade;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", grade=" + grade + ", cost=" + cost + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 50;
    }
}

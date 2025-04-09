package com.xworkz.Objects.internal;

public class Shoe {
    private String brand;
    private char grade;
    private int cost;

    public Shoe(String brand, char grade, int cost) {
        this.brand = brand;
        this.grade = grade;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Shoes [brand=" + brand + ", grade=" + grade + ", cost=" + cost + "]";
    }
}

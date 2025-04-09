package com.xworkz.Objects.internal;

public class Car {
    private String brand;
    private String grade;
    private int cost;

    public Car(String brand, String grade, int cost) {
        this.brand = brand;
        this.grade = grade;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", grade=" + grade + ", cost=" + cost + "]";
    }
}

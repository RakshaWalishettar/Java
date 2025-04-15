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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Car) {
                System.out.println("Object is an instance of Car");
                Car other = (Car) obj;
                if (this.brand.equals(other.brand)) {
                    System.out.println("Both Car are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", grade=" + grade + ", cost=" + cost + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 25;
    }
}

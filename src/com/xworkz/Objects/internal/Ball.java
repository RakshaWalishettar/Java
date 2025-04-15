package com.xworkz.Objects.internal;

public class Ball {
    private String brand;
    private char size;
    private int weight;

    public Ball(String brand, char size, int weight) {
        this.brand = brand;
        this.size = size;
        this.weight = weight;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Ball) {
                System.out.println("Object is an instance of AP");
                Ball other = (Ball) obj;
                if (this.brand.equals(other.brand)) {
                    System.out.println("Both Park are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Ball [brand=" + brand + ", size=" + size + ", weight=" + weight + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 9;
    }
}

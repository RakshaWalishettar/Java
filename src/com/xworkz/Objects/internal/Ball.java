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
    public String toString() {
        return "Ball [brand=" + brand + ", size=" + size + ", weight=" + weight + "]";
    }
}

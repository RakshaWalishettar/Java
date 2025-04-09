package com.xworkz.Objects.internal;

public class Mango {
    private String color;
    private double weight;
    private int sweetnessLevel;

    public Mango(String color, double weight, int sweetnessLevel) {
        this.color = color;
        this.weight = weight;
        this.sweetnessLevel = sweetnessLevel;
    }

    @Override
    public String toString() {
        return "Mango [color=" + color + ", weight=" + weight + ", sweetnessLevel=" + sweetnessLevel + "]";
    }

}

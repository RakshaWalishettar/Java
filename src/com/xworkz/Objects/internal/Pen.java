package com.xworkz.Objects.internal;

public class Pen {
    private String color;
    private char size;
    private int weight;

    public Pen(String color, char size, int weight) {
        this.color = color;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pen [color=" + color + ", size=" + size + ", weight=" + weight + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 50;
    }
}

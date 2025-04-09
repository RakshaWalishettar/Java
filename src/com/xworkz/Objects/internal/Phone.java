package com.xworkz.Objects.internal;

public class Phone {
    private String color;
    private char size;
    private int weight;

    public Phone(String color, char size, int weight) {
        this.color = color;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone [color=" + color + ", size=" + size + ", weight=" + weight + "]";
    }
}

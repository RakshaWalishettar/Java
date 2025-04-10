package com.xworkz.Objects.internal;

public class Dustbin {
    private String color;
    private char lidType;
    private int capacity;

    public Dustbin(String color, char lidType, int capacity) {
        this.color = color;
        this.lidType = lidType;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Dustbin [color=" + color + ", lidType=" + lidType + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 33;
    }
}

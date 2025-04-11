package com.xworkz.Objects.internal;

public class Restaurant {
    private String name;
    private char cuisine;
    private int capacity;

    public Restaurant(String name, char cuisine, int capacity) {
        this.name = name;
        this.cuisine = cuisine;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Restaurant [name=" + name + ", cuisine=" + cuisine + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -17;
    }
}

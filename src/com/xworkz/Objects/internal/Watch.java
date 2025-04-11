package com.xworkz.Objects.internal;

public class Watch {
    private String model;
    private char version;
    private int price;

    public Watch(String model, char version, int price) {
        this.model = model;
        this.version = version;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Watch [model=" + model + ", version=" + version + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -3;
    }
}

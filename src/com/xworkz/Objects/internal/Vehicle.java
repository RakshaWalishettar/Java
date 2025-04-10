package com.xworkz.Objects.internal;

public class Vehicle {
    private String type;
    private char fuel;
    private int wheels;

    public Vehicle(String type, char fuel, int wheels) {
        this.type = type;
        this.fuel = fuel;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Vehicle [type=" + type + ", fuel=" + fuel + ", wheels=" + wheels + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 50;
    }
}

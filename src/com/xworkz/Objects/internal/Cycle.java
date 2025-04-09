package com.xworkz.Objects.internal;

public class Cycle {
    private String brand;
    private char type;
    private int gear;

    public Cycle(String brand, char type, int gear) {
        this.brand = brand;
        this.type = type;
        this.gear = gear;
    }

    @Override
    public String toString() {
        return "Cycle [brand=" + brand + ", type=" + type + ", gear=" + gear + "]";
    }
}

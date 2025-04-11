package com.xworkz.Objects.internal;

public class Printer {
    private String model;
    private char type;
    private int printSpeed;

    public Printer(String model, char type, int printSpeed) {
        this.model = model;
        this.type = type;
        this.printSpeed = printSpeed;
    }

    @Override
    public String toString() {
        return "Printer [model=" + model + ", type=" + type + ", printSpeed=" + printSpeed + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -30;
    }
}

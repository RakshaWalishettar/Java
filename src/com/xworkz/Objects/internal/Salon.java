package com.xworkz.Objects.internal;

public class Salon {
    private String name;
    private char serviceType;
    private int stylists;

    public Salon(String name, char serviceType, int stylists) {
        this.name = name;
        this.serviceType = serviceType;
        this.stylists = stylists;
    }

    @Override
    public String toString() {
        return "Salon [name=" + name + ", serviceType=" + serviceType + ", stylists=" + stylists + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -16;
    }
}

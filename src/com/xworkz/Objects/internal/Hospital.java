package com.xworkz.Objects.internal;

public class Hospital {
    private String name;
    private char type;
    private int beds;

    public Hospital(String name, char type, int beds) {
        this.name = name;
        this.type = type;
        this.beds = beds;
    }

    @Override
    public String toString() {
        return "Hospital [name=" + name + ", type=" + type + ", beds=" + beds + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 47;
    }
}

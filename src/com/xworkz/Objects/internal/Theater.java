package com.xworkz.Objects.internal;

public class Theater {
    private String name;
    private char screenType;
    private int seats;

    public Theater(String name, char screenType, int seats) {
        this.name = name;
        this.screenType = screenType;
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Theater [name=" + name + ", screenType=" + screenType + ", seats=" + seats + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 50;
    }
}

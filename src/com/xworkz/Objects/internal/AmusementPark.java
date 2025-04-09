package com.xworkz.Objects.internal;

public class AmusementPark {
    private String name;
    private char zone;
    private int rides;

    public AmusementPark(String name, char zone, int rides) {
        this.name = name;
        this.zone = zone;
        this.rides = rides;
    }

    @Override
    public String toString() {
        return "AmusementPark [name=" + name + ", zone=" + zone + ", rides=" + rides + "]";
    }
}

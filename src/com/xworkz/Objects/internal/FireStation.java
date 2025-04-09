package com.xworkz.Objects.internal;

public class FireStation {
    private String location;
    private char zone;
    private int vehicles;

    public FireStation(String location, char zone, int vehicles) {
        this.location = location;
        this.zone = zone;
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "FireStation [location=" + location + ", zone=" + zone + ", vehicles=" + vehicles + "]";
    }
}

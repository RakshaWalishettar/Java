package com.xworkz.Objects.internal;

public class BusStation {
    private String name;
    private char platform;
    private int buses;

    public BusStation(String name, char platform, int buses) {
        this.name = name;
        this.platform = platform;
        this.buses = buses;
    }

    @Override
    public String toString() {
        return "BusStation [name=" + name + ", platform=" + platform + ", buses=" + buses + "]";
    }
}

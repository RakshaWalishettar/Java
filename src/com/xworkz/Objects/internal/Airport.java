package com.xworkz.Objects.internal;

public class Airport {
    private String name;
    private char terminal;
    private int flights;

    public Airport(String name, char terminal, int flights) {
        this.name = name;
        this.terminal = terminal;
        this.flights = flights;
    }

    @Override
    public String toString() {
        return "Airport [name=" + name + ", terminal=" + terminal + ", flights=" + flights + "]";
    }
}

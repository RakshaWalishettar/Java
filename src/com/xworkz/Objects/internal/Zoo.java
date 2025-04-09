package com.xworkz.Objects.internal;

public class Zoo {
    private String name;
    private char zone;
    private int animals;

    public Zoo(String name, char zone, int animals) {
        this.name = name;
        this.zone = zone;
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Zoo [name=" + name + ", zone=" + zone + ", animals=" + animals + "]";
    }
}

package com.xworkz.Objects.internal;

public class Aquarium {
    private String name;
    private char zone;
    private int species;

    public Aquarium(String name, char zone, int species) {
        this.name = name;
        this.zone = zone;
        this.species = species;
    }

    @Override
    public String toString() {
        return "Aquarium [name=" + name + ", zone=" + zone + ", species=" + species + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 006;
    }
}

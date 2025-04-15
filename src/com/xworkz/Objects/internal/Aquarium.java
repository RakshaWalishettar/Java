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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Aquarium) {
                System.out.println("Object is an instance of Aquarium");
                Aquarium other = (Aquarium) obj;
                if (this.name.equals(other.name)) {
                    System.out.println("Both aquarium are the same");
                    return true;
                }
            }
        }
        return false;
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

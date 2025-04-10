package com.xworkz.Objects.internal;

public class PetStore {
    private String name;
    private char animalType;
    private int pets;

    public PetStore(String name, char animalType, int pets) {
        this.name = name;
        this.animalType = animalType;
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "PetStore [name=" + name + ", animalType=" + animalType + ", pets=" + pets + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 50;
    }
}

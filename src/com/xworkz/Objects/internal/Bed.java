package com.xworkz.Objects.internal;

public class Bed {
    private char size;
    private String name;
    private String material;

    public Bed(char size, String name, String material) {
        this.size = size;
        this.name = name;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Bed [size=" + size + ", name=" + name + ", material=" + material + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 13;
    }

}

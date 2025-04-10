package com.xworkz.Objects.internal;

public class Farm {
    private String name;
    private char cropType;
    private int acres;

    public Farm(String name, char cropType, int acres) {
        this.name = name;
        this.cropType = cropType;
        this.acres = acres;
    }

    @Override
    public String toString() {
        return "Farm [name=" + name + ", cropType=" + cropType + ", acres=" + acres + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 39;
    }
}

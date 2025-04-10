package com.xworkz.Objects.internal;

public class Studio {
    private String name;
    private char medium;
    private int artists;

    public Studio(String name, char medium, int artists) {
        this.name = name;
        this.medium = medium;
        this.artists = artists;
    }

    @Override
    public String toString() {
        return "Studio [name=" + name + ", medium=" + medium + ", artists=" + artists + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 50;
    }
}

package com.xworkz.Objects.internal;

public class Resort {
    private String name;
    private char rating;
    private int rooms;

    public Resort(String name, char rating, int rooms) {
        this.name = name;
        this.rating = rating;
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Resort [name=" + name + ", rating=" + rating + ", rooms=" + rooms + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -17;
    }
}

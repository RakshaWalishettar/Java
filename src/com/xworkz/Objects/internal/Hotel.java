package com.xworkz.Objects.internal;

public class Hotel {
    private String name;
    private char rating;
    private int rooms;

    public Hotel(String name, char rating, int rooms) {
        this.name = name;
        this.rating = rating;
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Hotel [name=" + name + ", rating=" + rating + ", rooms=" + rooms + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 49;
    }
}

package com.xworkz.Objects.internal;

public class Cinema {
    private String name;
    private char screen;
    private int shows;

    public Cinema(String name, char screen, int shows) {
        this.name = name;
        this.screen = screen;
        this.shows = shows;
    }

    @Override
    public String toString() {
        return "Cinema [name=" + name + ", screen=" + screen + ", shows=" + shows + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 27;
    }
}

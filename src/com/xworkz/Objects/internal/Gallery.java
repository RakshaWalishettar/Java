package com.xworkz.Objects.internal;

public class Gallery {
    private String name;
    private char artType;
    private int pieces;

    public Gallery(String name, char artType, int pieces) {
        this.name = name;
        this.artType = artType;
        this.pieces = pieces;
    }

    @Override
    public String toString() {
        return "Gallery [name=" + name + ", artType=" + artType + ", pieces=" + pieces + "]";
    }
}

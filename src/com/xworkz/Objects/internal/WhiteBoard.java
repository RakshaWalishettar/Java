package com.xworkz.Objects.internal;

public class WhiteBoard {
    private String size;
    private char surfaceType;
    private int weight;

    public WhiteBoard(String size, char surfaceType, int weight) {
        this.size = size;
        this.surfaceType = surfaceType;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "WhiteBoard [size=" + size + ", surfaceType=" + surfaceType + ", weight=" + weight + "]";
    }
}

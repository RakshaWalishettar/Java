package com.xworkz.Objects.internal;

public class Mirror {
    private String shape;
    private char frameType;
    private int size;

    public Mirror(String shape, char frameType, int size) {
        this.shape = shape;
        this.frameType = frameType;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Mirror [shape=" + shape + ", frameType=" + frameType + ", size=" + size + "]";
    }
}

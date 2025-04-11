package com.xworkz.Objects.internal;

public class TableLamp {
    private String color;
    private char brightness;
    private int height;

    public TableLamp(String color, char brightness, int height) {
        this.color = color;
        this.brightness = brightness;
        this.height = height;
    }

    @Override
    public String toString() {
        return "TableLamp [color=" + color + ", brightness=" + brightness + ", height=" + height + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -24;
    }
}

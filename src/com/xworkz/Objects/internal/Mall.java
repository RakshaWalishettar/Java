package com.xworkz.Objects.internal;

public class Mall {
    private String name;
    private char area;
    private int shops;

    public Mall(String name, char area, int shops) {
        this.name = name;
        this.area = area;
        this.shops = shops;
    }

    @Override
    public String toString() {
        return "Mall [name=" + name + ", area=" + area + ", shops=" + shops + "]";
    }
}

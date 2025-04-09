package com.xworkz.Objects.internal;

public class FanRemote {
    private String brand;
    private char mode;
    private int buttons;

    public FanRemote(String brand, char mode, int buttons) {
        this.brand = brand;
        this.mode = mode;
        this.buttons = buttons;
    }

    @Override
    public String toString() {
        return "FanRemote [brand=" + brand + ", mode=" + mode + ", buttons=" + buttons + "]";
    }
}

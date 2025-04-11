package com.xworkz.Objects.internal;

public class Speaker {
    private String model;
    private char power;
    private int volume;

    public Speaker(String model, char power, int volume) {
        this.model = model;
        this.power = power;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Speaker [model=" + model + ", power=" + power + ", volume=" + volume + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -10;
    }
}

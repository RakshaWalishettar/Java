package com.xworkz.Objects.internal;

public class Wallet {
    private String leather;
    private char quality;
    private int slots;

    public Wallet(String leather, char quality, int slots) {
        this.leather = leather;
        this.quality = quality;
        this.slots = slots;
    }

    @Override
    public String toString() {
        return "Wallet [leather=" + leather + ", quality=" + quality + ", slots=" + slots + "]";
    }
}

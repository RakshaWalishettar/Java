package com.xworkz.Objects.internal;

public class MetroStation {
    private String name;
    private char line;
    private int frequency;

    public MetroStation(String name, char line, int frequency) {
        this.name = name;
        this.line = line;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "MetroStation [name=" + name + ", line=" + line + ", frequency=" + frequency + "]";
    }
}

package com.xworkz.Objects.internal;

public class Keyboard {
    private String layout;
    private char type;
    private int keys;

    public Keyboard(String layout, char type, int keys) {
        this.layout = layout;
        this.type = type;
        this.keys = keys;
    }

    @Override
    public String toString() {
        return "Keyboard [layout=" + layout + ", type=" + type + ", keys=" + keys + "]";
    }
}

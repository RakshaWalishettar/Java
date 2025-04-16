package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.Tool;

public class Hammer implements Tool {
    public void pickUp() {
        System.out.println("Picked up the hammer.");
    }
    public void use() {
        System.out.println("Hammering nails...");
    }
    public void putDown() {
        System.out.println("Hammer put down.");
    }
}

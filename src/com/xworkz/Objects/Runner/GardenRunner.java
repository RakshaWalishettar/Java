package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Garden;

public class GardenRunner {
    public static void main(String[] args) {
        Garden garden = new Garden("Botanic Bliss", 'F', 300);
        System.out.println(garden);

        int code = garden.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(garden));
    }
}

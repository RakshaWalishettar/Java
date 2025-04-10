package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Bottle;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle = new Bottle("Plastic", 1.0, true);
        System.out.println(bottle);

        int code = bottle.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(bottle));
    }
}

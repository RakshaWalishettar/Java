package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.WaterPurifier;

public class WaterPurifierRunner {
    public static void main(String[] args) {
        WaterPurifier wp = new WaterPurifier("Kent", 'R', 8);
        System.out.println(wp);

        int code = wp.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(wp));
    }
}

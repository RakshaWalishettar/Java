package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.BottelCap;

public class BottleCapRunner {
    public static void main(String[] args) {
        BottelCap cap = new BottelCap("Plastic", 'R', 30);
        System.out.println(cap);

        int code = cap.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(cap));
    }
}

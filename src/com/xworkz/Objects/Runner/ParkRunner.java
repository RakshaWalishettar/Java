package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Park;

public class ParkRunner {
    public static void main(String[] args) {
        Park p = new Park("Greenfield", 'U', 500);
        System.out.println(p);

        int code = p.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(p));
    }
}

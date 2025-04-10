package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Resort;

public class ResortRunner {
    public static void main(String[] args) {
        Resort r = new Resort("OceanView", 'A', 150);
        System.out.println(r);

        int code = r.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(r));
    }
}

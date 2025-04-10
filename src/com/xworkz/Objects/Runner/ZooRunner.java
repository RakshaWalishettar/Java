package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Zoo;

public class ZooRunner {
    public static void main(String[] args) {
        Zoo z = new Zoo("WildPark", 'A', 300);
        System.out.println(z);

        int code = z.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(z));
    }
}

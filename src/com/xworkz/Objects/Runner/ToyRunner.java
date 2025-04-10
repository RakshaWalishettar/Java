package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Toy;

public class ToyRunner {
    public static void main(String[] args) {
        Toy t = new Toy("Robot", 'R', 299);
        System.out.println(t);

        int code = t.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(t));
    }
}

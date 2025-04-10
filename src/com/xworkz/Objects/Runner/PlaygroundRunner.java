package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Playground;

public class PlaygroundRunner {
    public static void main(String[] args) {
        Playground p = new Playground("SunshinePark", 'B', 7);
        System.out.println(p);

        int code = p.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(p));
    }
}

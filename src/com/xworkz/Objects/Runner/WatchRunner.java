package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Watch;

public class WatchRunner {
    public static void main(String[] args) {
        Watch w = new Watch("Casio", 'X', 300);
        System.out.println(w);

        int code = w.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(w));
    }
}

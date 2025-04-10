package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Juicer;

public class JuicerRunner {
    public static void main(String[] args) {
        Juicer j = new Juicer("Philips", 'S', 3);
        System.out.println(j);

        int code = j.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(j));
    }
}

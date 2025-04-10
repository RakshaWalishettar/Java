package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Glass;

public class GlassRunner {
    public static void main(String[] args) {
        Glass g = new Glass("Round", 'M', 100);
        System.out.println(g);

        int code = g.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(g));
    }
}

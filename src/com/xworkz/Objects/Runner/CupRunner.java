package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Cup;

public class CupRunner {
    public static void main(String[] args) {
        Cup cup = new Cup("Ceramic", 'S', 250);
        System.out.println(cup);

        int code = cup.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(cup));
    }
}

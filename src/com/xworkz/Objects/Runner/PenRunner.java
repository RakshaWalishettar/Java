package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Pen;

public class PenRunner {
    public static void main(String[] args) {
        Pen p = new Pen("Blue", 'M', 10);
        System.out.println(p);

        int code = p.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(p));
    }
}

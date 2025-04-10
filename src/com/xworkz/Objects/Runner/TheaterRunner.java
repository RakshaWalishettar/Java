package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Theater;

public class TheaterRunner {
    public static void main(String[] args) {
        Theater t = new Theater("CineWorld", 'L', 300);
        System.out.println(t);

        int code = t.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(t));
    }
}

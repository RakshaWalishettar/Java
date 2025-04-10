package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Shirt;

public class ShirtRunner {
    public static void main(String[] args) {
        Shirt s = new Shirt("Blue", 'L', 499);
        System.out.println(s);

        int code = s.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(s));
    }
}

package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Cafe;

public class CafeRunner {
    public static void main(String[] args) {
        Cafe cafe = new Cafe("JavaCafe", 'M', 20);
        System.out.println(cafe);

        int code = cafe.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(cafe));
    }
}

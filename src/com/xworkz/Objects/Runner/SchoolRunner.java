package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.School;

public class SchoolRunner {
    public static void main(String[] args) {
        School s = new School("BrightFuture", 'C', 800);
        System.out.println(s);

        int code = s.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(s));
    }
}

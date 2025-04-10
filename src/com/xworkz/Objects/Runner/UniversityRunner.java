package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.University;

public class UniversityRunner {
    public static void main(String[] args) {
        University u = new University("TechUni", 'A', 12000);
        System.out.println(u);

        int code = u.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(u));
    }
}

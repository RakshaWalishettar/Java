package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Lab;

public class LabRunner {
    public static void main(String[] args) {
        Lab l = new Lab("BioLab", 'B', 150);
        System.out.println(l);

        int code = l.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(l));
    }
}

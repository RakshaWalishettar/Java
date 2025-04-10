package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital h = new Hospital("CityCare", 'M', 150);
        System.out.println(h);

        int code = h.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(h));
    }
}

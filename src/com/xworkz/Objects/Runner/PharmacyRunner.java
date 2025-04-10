package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Pharmacy;

public class PharmacyRunner {
    public static void main(String[] args) {
        Pharmacy p = new Pharmacy("HealthPlus", 'Y', 500);
        System.out.println(p);

        int code = p.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(p));
    }
}

package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Salon;

public class SalonRunner {
    public static void main(String[] args) {
        Salon s = new Salon("GlowUp", 'B', 12);
        System.out.println(s);

        int code = s.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(s));
    }
}

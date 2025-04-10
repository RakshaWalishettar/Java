package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Soap;

public class SoapRunner {
    public static void main(String[] args) {
        Soap s = new Soap("Lavender", 'A', 30);
        System.out.println(s);

        int code = s.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(s));
    }
}

package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Toaster;

public class ToasterRunner {
    public static void main(String[] args) {
        Toaster t = new Toaster("Morphy", 'D', 900);
        System.out.println(t);

        int code = t.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(t));
    }
}

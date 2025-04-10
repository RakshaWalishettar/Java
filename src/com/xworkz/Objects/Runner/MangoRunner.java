package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Mango;

public class MangoRunner {
    public static void main(String[] args) {
        Mango mango = new Mango("Yellow", 1.2, 8);
        System.out.println(mango);

        int code = mango.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(mango));
    }
}

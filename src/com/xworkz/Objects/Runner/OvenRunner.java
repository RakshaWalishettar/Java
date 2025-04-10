package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Oven;

public class OvenRunner {
    public static void main(String[] args) {
        Oven o = new Oven("Bosch", 'E', 65);
        System.out.println(o);

        int code = o.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(o));
    }
}

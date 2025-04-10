package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Factory;

public class FactoryRunner {
    public static void main(String[] args) {
        Factory factory = new Factory("SteelMakers", 'S', 500);
        System.out.println(factory);

        int code = factory.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(factory));
    }
}

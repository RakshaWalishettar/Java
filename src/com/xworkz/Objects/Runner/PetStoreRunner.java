package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.PetStore;

public class PetStoreRunner {
    public static void main(String[] args) {
        PetStore p = new PetStore("PetWorld", 'D', 80);
        System.out.println(p);

        int code = p.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(p));
    }
}

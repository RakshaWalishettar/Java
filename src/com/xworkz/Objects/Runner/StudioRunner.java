package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Studio;

public class StudioRunner {
    public static void main(String[] args) {
        Studio s = new Studio("ArtHouse", 'P', 20);
        System.out.println(s);

        int code = s.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(s));
    }
}

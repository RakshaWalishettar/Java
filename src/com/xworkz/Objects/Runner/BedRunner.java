package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Bed;


public class BedRunner {
    public static void main(String[] args) {
        Bed bed = new Bed('K', "karlon", "wood");
        System.out.println(bed);

        int code = bed.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(bed));
    }
}

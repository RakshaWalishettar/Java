package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.ElectricKettle;

public class ElectricKettleRunner {
    public static void main(String[] args) {
        ElectricKettle ek = new ElectricKettle("Prestige", 'S', 2);
        System.out.println(ek);

        int code = ek.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(ek));
    }
}

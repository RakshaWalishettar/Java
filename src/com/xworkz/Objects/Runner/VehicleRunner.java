package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Car", 'P', 4);
        System.out.println(v);

        int code = v.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(v));
    }
}

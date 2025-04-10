package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.AirConditioner;
import com.xworkz.Objects.internal.Airport;

public class AirportRunner {
    public static void main(String[] args) {
        Airport airport = new Airport("SkyPort", 'A', 700);
        System.out.println(airport);

        int code = airport.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: "+System.identityHashCode(airport));    }
}

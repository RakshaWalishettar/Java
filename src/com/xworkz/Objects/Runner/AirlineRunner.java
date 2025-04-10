package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.AirConditioner;
import com.xworkz.Objects.internal.Airline;

public class AirlineRunner {
    public static void main(String[] args) {
        Airline a = new Airline("SkyJet", 'E', 180);
        System.out.println(a);

        int code = a.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: "+System.identityHashCode(a));    }
}

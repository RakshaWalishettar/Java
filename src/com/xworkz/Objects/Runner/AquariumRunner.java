package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.AirConditioner;
import com.xworkz.Objects.internal.Aquarium;

public class AquariumRunner {
    public static void main(String[] args) {
        Aquarium aq1 = new Aquarium("AquaZone", 'T', 150);
        Aquarium aq2 = new Aquarium("AquaZone",'M',250);

        int code = aq1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: "+System.identityHashCode(aq1));    }
}

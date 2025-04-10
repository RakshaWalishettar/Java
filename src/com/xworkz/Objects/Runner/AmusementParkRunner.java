package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.AirConditioner;
import com.xworkz.Objects.internal.AmusementPark;

public class AmusementParkRunner {
    public static void main(String[] args) {
        AmusementPark ap = new AmusementPark("FunLand", 'F', 25);
        System.out.println(ap);

        int code = ap.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: "+System.identityHashCode(ap));    }
}

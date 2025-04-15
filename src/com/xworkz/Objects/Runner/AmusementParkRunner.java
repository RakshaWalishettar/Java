package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.AirConditioner;
import com.xworkz.Objects.internal.AmusementPark;

public class AmusementParkRunner {
    public static void main(String[] args) {
        AmusementPark ap1 = new AmusementPark("FunLand", 'F', 25);
        AmusementPark ap2 = new AmusementPark("FunLand",'G',85);

        System.out.println("the AC has:"+(ap1==ap2));
        boolean same=ap1.equals(ap2);
        System.out.println("both AC1 and AC2 are same :"+same);


        int code = ap1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: "+System.identityHashCode(ap1));    }
}

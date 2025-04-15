package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.AirConditioner;
import com.xworkz.Objects.internal.Airport;

public class AirportRunner {
    public static void main(String[] args) {
        Airport airport1 = new Airport("SkyPort", 'A', 700);
        Airport airport2=new Airport("SkyPort",'C',540);

        System.out.println("the AC has:"+(airport1==airport2));
        boolean same=airport1.equals(airport2);
        System.out.println("both AC1 and AC2 are same :"+same);

        int code = airport1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: "+System.identityHashCode(airport1));    }
}

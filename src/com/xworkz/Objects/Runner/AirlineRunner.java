package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.AirConditioner;
import com.xworkz.Objects.internal.Airline;

public class AirlineRunner {
    public static void main(String[] args) {
        Airline a1 = new Airline("SkyJet", 'E', 180);

        Airline a2=new Airline("SkyJet",'B',150);

        System.out.println("the AC has:"+(a1==a2));
        boolean same=a1.equals(a2);
        System.out.println("both AC1 and AC2 are same :"+same);

        int code = a1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: "+System.identityHashCode(a1));    }
}

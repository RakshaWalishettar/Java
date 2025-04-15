package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.BusStation;

public class BusStationRuuner {
    public static void main(String[] args) {
        BusStation busStation1 = new BusStation("CentralHub", 'D', 40);
        BusStation busStation2=new BusStation("CentralHub",'T',5);
        System.out.println("the bustation has:"+(busStation1==busStation2));
        boolean same=busStation1.equals(busStation2);
        System.out.println("both busttion1 and bustation2 are same :"+same);

        System.out.println(busStation1);

        int code = busStation1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(busStation1));
    }
}

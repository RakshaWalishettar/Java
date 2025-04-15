package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.MetroStation;

public class MetroStationRunner {
    public static void main(String[] args) {
        MetroStation ms = new MetroStation("GreenLineStation", 'G', 5);
        MetroStation metroStation=new MetroStation("GreenLineStation",'G',6);
        System.out.println(ms);
        System.out.println("the farm has:"+(ms==metroStation));
        boolean same=ms.equals(metroStation);
        System.out.println("both farm and farm1 are same :"+same);


        int code = ms.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(ms));
    }
}

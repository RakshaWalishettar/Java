package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.MetroStation;

public class MetroStationRunner {
    public static void main(String[] args) {
        MetroStation ms = new MetroStation("GreenLineStation", 'G', 5);
        System.out.println(ms);

        int code = ms.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(ms));
    }
}

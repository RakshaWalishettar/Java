package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.BusStation;

public class BusStationRuuner {
    public static void main(String[] args) {
        BusStation busStation = new BusStation("CentralHub", 'D', 40);
        System.out.println(busStation);

        int code = busStation.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(busStation));
    }
}

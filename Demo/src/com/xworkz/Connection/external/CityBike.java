package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.CycleRental;

public class CityBike implements CycleRental {
    public void unlockBike() {
        System.out.println("Bike unlocked from station.");
    }
    public void rideBike() {
        System.out.println("Riding city bike...");
    }
    public void lockBike() {
        System.out.println("Bike locked at new station.");
    }
}

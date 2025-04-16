package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.RideSharing;

public class Rapido implements RideSharing {
    public void bookRide() {
        System.out.println("Booking a ride with Uber.");
    }

    public void startRide() {
        System.out.println("Ride started with Uber.");
    }

    public void endRide() {
        System.out.println("Ride ended with Uber.");
    }

}

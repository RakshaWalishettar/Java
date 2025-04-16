package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.Uber;
import com.xworkz.Connection.internal.RideService;

public class UberRunner {
    public static void main(String[] args) {
        RideService ride = new Uber();
        ride.bookRide();
        ride.trackRide();
        ride.cancelRide();
    }
}

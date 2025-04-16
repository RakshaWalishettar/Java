package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.Ola;
import com.xworkz.Connection.internal.TaxiService;

public class OlaRunner {
    public static void main(String[] args) {
        TaxiService ride = new Ola();
        ride.bookRide();
        ride.startTrip();
        ride.endTrip();
    }
}

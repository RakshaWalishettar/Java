package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.TaxiService;

public class Ola implements TaxiService {
    public void bookRide() {
        System.out.println("Uber ride booked.");
    }

    public void startTrip() {
        System.out.println("Uber trip started.");
    }

    public void endTrip() {
        System.out.println("Uber trip ended.");
    }

}

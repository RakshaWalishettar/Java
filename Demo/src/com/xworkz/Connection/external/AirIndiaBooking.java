package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.FlightBooking;

public class AirIndiaBooking implements FlightBooking {
    public void searchFlights() {
        System.out.println("Searching Air India flights...");
    }
    public void bookTicket() {
        System.out.println("Flight ticket booked.");
    }
    public void cancelTicket() {
        System.out.println("Flight ticket cancelled.");
    }

}

package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.AirIndiaBooking;
import com.xworkz.Connection.internal.FlightBooking;

public class AirIndiaBookingRunner {
    public static void main(String[] args) {
        FlightBooking fb = new AirIndiaBooking();
        fb.searchFlights();
        fb.bookTicket();
        fb.cancelTicket();
    }
}

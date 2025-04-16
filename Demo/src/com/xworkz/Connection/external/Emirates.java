package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.AirlineService;

public class Emirates implements AirlineService {
    public void bookTicket() {
        System.out.println("Flight ticket booked with Emirates.");
    }
    public void checkIn() {
        System.out.println("Checked in successfully.");
    }
    public void boardFlight() {
        System.out.println("Boarded Emirates flight.");
    }
}

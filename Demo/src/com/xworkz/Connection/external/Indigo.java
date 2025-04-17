package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.Airline;

public class Indigo implements Airline {
    public void bookTicket() {
        System.out.println("Ticket booked with Emirates.");
    }

    public void fly() {
        System.out.println("Flight has taken off.");
    }

    public void land() {
        System.out.println("Flight has landed safely.");
    }
    @Override
    public void cheap() {
        System.out.println("Welcome!");
    }
}

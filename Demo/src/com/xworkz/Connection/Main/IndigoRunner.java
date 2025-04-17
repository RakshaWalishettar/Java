package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.Indigo;
import com.xworkz.Connection.internal.Airline;

public class IndigoRunner {
    public static void main(String[] args) {
        Airline airline = new Indigo();
        airline.bookTicket();
        airline.fly();
        airline.land();
        airline.cheap();
    }
}

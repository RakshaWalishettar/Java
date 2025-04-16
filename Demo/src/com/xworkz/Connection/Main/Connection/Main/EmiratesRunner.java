package com.xworkz.Connection.Main.Connection.Main;

import com.xworkz.Connection.external.Emirates;
import com.xworkz.Connection.internal.AirlineService;

public class EmiratesRunner {
    public static void main(String[] args) {
        AirlineService airline = new Emirates();
        airline.bookTicket();
        airline.checkIn();
        airline.boardFlight();
    }
}

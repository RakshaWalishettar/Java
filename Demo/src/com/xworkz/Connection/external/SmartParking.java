package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.ParkingSystem;

public class SmartParking implements ParkingSystem {
    public void scanTicket() {
        System.out.println("Ticket scanned by SmartParking.");
    }

    public void openGate() {
        System.out.println("Gate opened by SmartParking.");
    }

    public void closeGate() {
        System.out.println("Gate closed by SmartParking.");
    }

}

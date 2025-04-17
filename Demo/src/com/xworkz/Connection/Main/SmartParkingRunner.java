package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.SmartParking;
import com.xworkz.Connection.internal.ParkingSystem;

public class SmartParkingRunner {
    public static void main(String[] args) {
        ParkingSystem parking = new SmartParking();
        parking.scanTicket();
        parking.openGate();
        parking.closeGate();
        parking.vehicals();
    }
}

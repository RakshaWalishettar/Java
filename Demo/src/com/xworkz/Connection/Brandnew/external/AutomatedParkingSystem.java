package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class AutomatedParkingSystem implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("AutomatedParkingSystem powered on.");
    }

    public void powerOff() {
        System.out.println("AutomatedParkingSystem powered off.");
    }

    public void connect() {
        System.out.println("AutomatedParkingSystem connected to network.");
    }

    public void enableWiFi() {
        System.out.println("AutomatedParkingSystem WiFi enabled.");
    }

    public void enableBluetooth() {
        System.out.println("AutomatedParkingSystem Bluetooth enabled.");
    }

    public void checkSignal() {
        System.out.println("AutomatedParkingSystem signal checked.");
    }
}

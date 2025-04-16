package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class AutonomousCar implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("AutonomousCar powered on.");
    }
    public void powerOff() {
        System.out.println("AutonomousCar powered off.");
    }
    public void connect() {
        System.out.println("AutonomousCar connected to network.");
    }
    public void enableWiFi() {
        System.out.println("AutonomousCar WiFi enabled.");
    }
    public void enableBluetooth() {
        System.out.println("AutonomousCar Bluetooth enabled.");
    }
    public void checkSignal() {
        System.out.println("AutonomousCar signal checked.");
    }
}


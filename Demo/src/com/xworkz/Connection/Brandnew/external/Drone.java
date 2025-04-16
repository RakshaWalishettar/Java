package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class Drone implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("Drone powered on.");
    }
    public void powerOff() {
        System.out.println("Drone powered off.");
    }
    public void connect() {
        System.out.println("Drone connected to network.");
    }
    public void enableWiFi() {
        System.out.println("Drone WiFi enabled.");
    }
    public void enableBluetooth() {
        System.out.println("Drone Bluetooth enabled.");
    }
    public void checkSignal() {
        System.out.println("Drone signal checked.");
    }

}

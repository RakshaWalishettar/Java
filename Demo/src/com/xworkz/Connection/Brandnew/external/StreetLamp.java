package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class StreetLamp implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("StreetLamp powered on.");
    }
    public void powerOff() {
        System.out.println("StreetLamp powered off.");
    }
    public void connect() {
        System.out.println("StreetLamp connected to network.");
    }
    public void enableWiFi() {
        System.out.println("StreetLamp WiFi enabled.");
    }
    public void enableBluetooth() {
        System.out.println("StreetLamp Bluetooth enabled.");
    }
    public void checkSignal() {
        System.out.println("StreetLamp signal checked.");
    }

}

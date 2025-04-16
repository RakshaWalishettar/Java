package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class SmartHelmet implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("SmartHelmet powered on.");
    }
    public void powerOff() {
        System.out.println("SmartHelmet powered off.");
    }
    public void connect() {
        System.out.println("SmartHelmet connected to network.");
    }
    public void enableWiFi() {
        System.out.println("SmartHelmet WiFi enabled.");
    }
    public void enableBluetooth() {
        System.out.println("SmartHelmet Bluetooth enabled.");
    }
    public void checkSignal() {
        System.out.println("SmartHelmet signal checked.");
    }

}

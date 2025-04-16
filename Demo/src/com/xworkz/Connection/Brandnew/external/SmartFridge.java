package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class SmartFridge implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("SmartFridge powered on.");
    }
    public void powerOff() {
        System.out.println("SmartFridge powered off.");
    }
    public void connect() {
        System.out.println("SmartFridge connected to network.");
    }
    public void enableWiFi() {
        System.out.println("SmartFridge WiFi enabled.");
    }
    public void enableBluetooth() {
        System.out.println("SmartFridge Bluetooth enabled.");
    }
    public void checkSignal() {
        System.out.println("SmartFridge signal strength checked.");
    }

}

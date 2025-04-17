package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class SmartMicrowave implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("SmartMicrowave powered on.");
    }
    public void powerOff() {
        System.out.println("SmartMicrowave powered off.");
    }
    public void connect() {
        System.out.println("SmartMicrowave connected to network.");
    }
    public void enableWiFi() {
        System.out.println("SmartMicrowave WiFi enabled.");
    }
    public void enableBluetooth() {
        System.out.println("SmartMicrowave Bluetooth enabled.");
    }
    public void checkSignal() {
        System.out.println("SmartMicrowave signal strength checked.");
    }
}

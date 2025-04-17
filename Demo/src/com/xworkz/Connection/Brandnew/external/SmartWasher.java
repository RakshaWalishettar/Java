package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class SmartWasher implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("SmartWasher powered on.");
    }
    public void powerOff() {
        System.out.println("SmartWasher powered off.");
    }
    public void connect() {
        System.out.println("SmartWasher connected to network.");
    }
    public void enableWiFi() {
        System.out.println("SmartWasher WiFi enabled.");
    }
    public void enableBluetooth() {
        System.out.println("SmartWasher Bluetooth enabled.");
    }
    public void checkSignal() {
        System.out.println("SmartWasher signal strength checked.");
    }
}

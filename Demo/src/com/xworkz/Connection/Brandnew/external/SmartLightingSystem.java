package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class SmartLightingSystem implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("SmartLightingSystem powered on.");
    }

    public void powerOff() {
        System.out.println("SmartLightingSystem powered off.");
    }

    public void connect() {
        System.out.println("SmartLightingSystem connected to network.");
    }

    public void enableWiFi() {
        System.out.println("SmartLightingSystem WiFi enabled.");
    }

    public void enableBluetooth() {
        System.out.println("SmartLightingSystem Bluetooth enabled.");
    }

    public void checkSignal() {
        System.out.println("SmartLightingSystem signal checked.");
    }

}

package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class FactoryArm implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("FactoryArm powered on.");
    }
    public void powerOff() {
        System.out.println("FactoryArm powered off.");
    }
    public void connect() {
        System.out.println("FactoryArm connected to network.");
    }
    public void enableWiFi() {
        System.out.println("FactoryArm WiFi enabled.");
    }
    public void enableBluetooth() {
        System.out.println("FactoryArm Bluetooth enabled.");
    }
    public void checkSignal() {
        System.out.println("FactoryArm signal checked.");
    }
}

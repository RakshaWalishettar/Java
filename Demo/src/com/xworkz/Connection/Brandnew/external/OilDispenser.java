package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class OilDispenser implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("OilDispenser powered on.");
    }
    public void powerOff() {
        System.out.println("OilDispenser powered off.");
    }
    public void connect() {
        System.out.println("OilDispenser connected to network.");
    }
    public void enableWiFi() {
        System.out.println("OilDispenser WiFi enabled.");
    }
    public void enableBluetooth() {
        System.out.println("OilDispenser Bluetooth enabled.");
    }
    public void checkSignal() {
        System.out.println("OilDispenser signal checked.");
    }
}

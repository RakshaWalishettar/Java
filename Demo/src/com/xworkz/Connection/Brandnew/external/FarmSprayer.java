package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class FarmSprayer implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("FarmSprayer powered on.");
    }
    public void powerOff() {
        System.out.println("FarmSprayer powered off.");
    }
    public void connect() {
        System.out.println("FarmSprayer connected to network.");
    }
    public void enableWiFi() {
        System.out.println("FarmSprayer WiFi enabled.");
    }
    public void enableBluetooth() {
        System.out.println("FarmSprayer Bluetooth enabled.");
    }
    public void checkSignal() {
        System.out.println("FarmSprayer signal checked.");
    }
}

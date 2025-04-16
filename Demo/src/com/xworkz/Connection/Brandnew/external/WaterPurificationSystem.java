package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class WaterPurificationSystem implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("WaterPurificationSystem powered on.");
    }

    public void powerOff() {
        System.out.println("WaterPurificationSystem powered off.");
    }

    public void connect() {
        System.out.println("WaterPurificationSystem connected to network.");
    }

    public void enableWiFi() {
        System.out.println("WaterPurificationSystem WiFi enabled.");
    }

    public void enableBluetooth() {
        System.out.println("WaterPurificationSystem Bluetooth enabled.");
    }

    public void checkSignal() {
        System.out.println("WaterPurificationSystem signal checked.");
    }

}

package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class FitnessTracker implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("FitnessTracker powered on.");
    }
    public void powerOff() {
        System.out.println("FitnessTracker powered off.");
    }
    public void connect() {
        System.out.println("FitnessTracker connected to network.");
    }
    public void enableWiFi() {
        System.out.println("FitnessTracker WiFi enabled.");
    }
    public void enableBluetooth() {
        System.out.println("FitnessTracker Bluetooth enabled.");
    }
    public void checkSignal() {
        System.out.println("FitnessTracker signal checked.");
    }

}

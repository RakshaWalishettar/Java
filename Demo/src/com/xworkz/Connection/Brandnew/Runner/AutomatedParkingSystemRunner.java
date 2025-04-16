package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.AutomatedParkingSystem;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class AutomatedParkingSystemRunner {
    public static void main(String[] args) {
        SmartDevice device = new AutomatedParkingSystem();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new AutomatedParkingSystem();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

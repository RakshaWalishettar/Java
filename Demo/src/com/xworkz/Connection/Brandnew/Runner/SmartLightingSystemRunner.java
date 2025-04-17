package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.SmartLightingSystem;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class SmartLightingSystemRunner {
    public static void main(String[] args) {
        SmartDevice device = new SmartLightingSystem();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new SmartLightingSystem();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

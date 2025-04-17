package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.ConstructionCrane;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class ConstructionCraneRunner {
    public static void main(String[] args) {
        SmartDevice device = new ConstructionCrane();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new ConstructionCrane();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

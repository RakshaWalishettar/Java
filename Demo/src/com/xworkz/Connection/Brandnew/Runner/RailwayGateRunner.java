package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.RailwayGate;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class RailwayGateRunner {
    public static void main(String[] args) {
        SmartDevice device = new RailwayGate();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new RailwayGate();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

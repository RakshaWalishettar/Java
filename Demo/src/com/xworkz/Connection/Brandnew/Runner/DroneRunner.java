package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.Drone;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class DroneRunner {
    public static void main(String[] args) {
        SmartDevice device = new Drone();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new Drone();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

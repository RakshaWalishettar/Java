package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.PatrolDrone;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class PatrolDroneRunner {
    public static void main(String[] args) {
        SmartDevice device = new PatrolDrone();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new PatrolDrone();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.FitnessTracker;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class FitnessTrackerRunner {
    public static void main(String[] args) {
        SmartDevice device = new FitnessTracker();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new FitnessTracker();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

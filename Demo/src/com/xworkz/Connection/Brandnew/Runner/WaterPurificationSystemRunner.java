package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.WaterPurificationSystem;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class WaterPurificationSystemRunner {
    public static void main(String[] args) {
        SmartDevice device = new WaterPurificationSystem();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new WaterPurificationSystem();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

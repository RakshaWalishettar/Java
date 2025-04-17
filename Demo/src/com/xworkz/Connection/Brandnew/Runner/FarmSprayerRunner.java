package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.FarmSprayer;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class FarmSprayerRunner {
    public static void main(String[] args) {
        SmartDevice device = new FarmSprayer();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new FarmSprayer();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

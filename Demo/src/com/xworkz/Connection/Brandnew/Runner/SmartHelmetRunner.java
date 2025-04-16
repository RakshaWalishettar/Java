package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.SmartHelmet;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class SmartHelmetRunner {
    public static void main(String[] args) {
        SmartDevice device = new SmartHelmet();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new SmartHelmet();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

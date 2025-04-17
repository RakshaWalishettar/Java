package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.StreetLamp;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class StreetLampRunner {
    public static void main(String[] args) {
        SmartDevice device = new StreetLamp();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new StreetLamp();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

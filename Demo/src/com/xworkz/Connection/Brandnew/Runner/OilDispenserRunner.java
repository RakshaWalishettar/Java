package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.OilDispenser;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class OilDispenserRunner {
    public static void main(String[] args) {
        SmartDevice device = new OilDispenser();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new OilDispenser();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

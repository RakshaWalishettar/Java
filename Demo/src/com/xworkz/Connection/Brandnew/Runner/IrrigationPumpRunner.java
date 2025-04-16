package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.IrrigationPump;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class IrrigationPumpRunner {
    public static void main(String[] args) {
        SmartDevice device = new IrrigationPump();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new IrrigationPump();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

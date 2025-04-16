package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.AutomatedGreenhouse;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class AutomatedGreenhouseRUnner {
    public static void main(String[] args) {
        SmartDevice device = new AutomatedGreenhouse();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new AutomatedGreenhouse();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

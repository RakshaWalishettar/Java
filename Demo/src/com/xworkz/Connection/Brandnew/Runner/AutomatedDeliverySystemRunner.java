package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.AutomatedDeliverySystem;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class AutomatedDeliverySystemRunner {
    public static void main(String[] args) {
        SmartDevice device = new AutomatedDeliverySystem();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new AutomatedDeliverySystem();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

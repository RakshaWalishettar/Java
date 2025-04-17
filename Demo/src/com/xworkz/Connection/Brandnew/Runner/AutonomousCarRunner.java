package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.AutonomousCar;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class AutonomousCarRunner {
    public static void main(String[] args) {
        SmartDevice device = new AutonomousCar();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new AutonomousCar();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

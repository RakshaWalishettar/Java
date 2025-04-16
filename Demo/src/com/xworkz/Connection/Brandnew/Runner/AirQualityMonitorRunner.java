package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.AirQualityMonitor;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class AirQualityMonitorRunner {
    public static void main(String[] args) {
        SmartDevice device = new AirQualityMonitor();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new AirQualityMonitor();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

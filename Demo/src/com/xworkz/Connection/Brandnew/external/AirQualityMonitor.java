package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class AirQualityMonitor implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("AirQualityMonitor powered on.");
    }

    public void powerOff() {
        System.out.println("AirQualityMonitor powered off.");
    }

    public void connect() {
        System.out.println("AirQualityMonitor connected to network.");
    }

    public void enableWiFi() {
        System.out.println("AirQualityMonitor WiFi enabled.");
    }

    public void enableBluetooth() {
        System.out.println("AirQualityMonitor Bluetooth enabled.");
    }

    public void checkSignal() {
        System.out.println("AirQualityMonitor signal checked.");
    }

}

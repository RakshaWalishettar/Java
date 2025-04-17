package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class WeatherStation implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("WeatherStation powered on.");
    }
    public void powerOff() {
        System.out.println("WeatherStation powered off.");
    }
    public void connect() {
        System.out.println("WeatherStation connected to network.");
    }
    public void enableWiFi() {
        System.out.println("WeatherStation WiFi enabled.");
    }
    public void enableBluetooth() {
        System.out.println("WeatherStation Bluetooth enabled.");
    }
    public void checkSignal() {
        System.out.println("WeatherStation signal checked.");
    }
}

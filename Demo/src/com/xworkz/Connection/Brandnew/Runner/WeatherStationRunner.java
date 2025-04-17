package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.WeatherStation;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class WeatherStationRunner {
    public static void main(String[] args) {
        SmartDevice device = new WeatherStation();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new WeatherStation();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

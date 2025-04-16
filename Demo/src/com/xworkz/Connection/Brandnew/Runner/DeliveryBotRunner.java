package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.DeliveryBot;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class DeliveryBotRunner {
    public static void main(String[] args) {
        SmartDevice device = new DeliveryBot();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new DeliveryBot();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

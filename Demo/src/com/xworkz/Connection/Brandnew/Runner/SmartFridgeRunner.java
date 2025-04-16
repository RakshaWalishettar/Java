package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.SmartFridge;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class SmartFridgeRunner {
    public static void main(String[] args) {
        SmartDevice device1 = new SmartFridge();
        Connectivity device2 = new SmartFridge();

        device1.powerOn();
        device1.connect();
        device1.powerOff();

        device2.enableWiFi();
        device2.enableBluetooth();
        device2.checkSignal();
    }
}

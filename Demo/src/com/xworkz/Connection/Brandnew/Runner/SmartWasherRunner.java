package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.SmartWasher;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class SmartWasherRunner {
    public static void main(String[] args) {
        SmartDevice device1 = new SmartWasher();
        Connectivity device2 = new SmartWasher();

        device1.powerOn();
        device1.connect();
        device1.powerOff();

        device2.enableWiFi();
        device2.enableBluetooth();
        device2.checkSignal();
    }
}

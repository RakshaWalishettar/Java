package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.SmartMicrowave;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class SmartMicrowaveRunner {
    public static void main(String[] args) {
        SmartDevice device1 = new SmartMicrowave();
        Connectivity device2 = new SmartMicrowave();

        device1.powerOn();
        device1.connect();
        device1.powerOff();

        device2.enableWiFi();
        device2.enableBluetooth();
        device2.checkSignal();
    }
}

package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.FactoryArm;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class FactoryArmRunner {
    public static void main(String[] args) {
        SmartDevice device = new FactoryArm();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new FactoryArm();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

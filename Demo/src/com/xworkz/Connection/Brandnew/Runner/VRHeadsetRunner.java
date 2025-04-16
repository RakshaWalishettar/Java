package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.VRHeadset;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class VRHeadsetRunner {
    public static void main(String[] args) {
        SmartDevice device = new VRHeadset();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new VRHeadset();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

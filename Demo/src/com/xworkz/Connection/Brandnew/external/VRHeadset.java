package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class VRHeadset implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("VRHeadset powered on.");
    }
    public void powerOff() {
        System.out.println("VRHeadset powered off.");
    }
    public void connect() {
        System.out.println("VRHeadset connected to network.");
    }
    public void enableWiFi() {
        System.out.println("VRHeadset WiFi enabled.");
    }
    public void enableBluetooth() {
        System.out.println("VRHeadset Bluetooth enabled.");
    }
    public void checkSignal() {
        System.out.println("VRHeadset signal checked.");
    }
}

package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class RailwayGate implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("RailwayGate powered on.");
    }
    public void powerOff() {
        System.out.println("RailwayGate powered off.");
    }
    public void connect() {
        System.out.println("RailwayGate connected to network.");
    }
    public void enableWiFi() {
        System.out.println("RailwayGate WiFi enabled.");
    }
    public void enableBluetooth() {
        System.out.println("RailwayGate Bluetooth enabled.");
    }
    public void checkSignal() {
        System.out.println("RailwayGate signal checked.");
    }

}

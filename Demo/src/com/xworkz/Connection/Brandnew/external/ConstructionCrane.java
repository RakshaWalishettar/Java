package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class ConstructionCrane implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("ConstructionCrane powered on.");
    }
    public void powerOff() {
        System.out.println("ConstructionCrane powered off.");
    }
    public void connect() {
        System.out.println("ConstructionCrane connected to network.");
    }
    public void enableWiFi() {
        System.out.println("ConstructionCrane WiFi enabled.");
    }
    public void enableBluetooth() {
        System.out.println("ConstructionCrane Bluetooth enabled.");
    }
    public void checkSignal() {
        System.out.println("ConstructionCrane signal checked.");
    }

}

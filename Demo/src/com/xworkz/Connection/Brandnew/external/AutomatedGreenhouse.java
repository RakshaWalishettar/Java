package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class AutomatedGreenhouse implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("AutomatedGreenhouse powered on.");
    }

    public void powerOff() {
        System.out.println("AutomatedGreenhouse powered off.");
    }

    public void connect() {
        System.out.println("AutomatedGreenhouse connected to network.");
    }

    public void enableWiFi() {
        System.out.println("AutomatedGreenhouse WiFi enabled.");
    }

    public void enableBluetooth() {
        System.out.println("AutomatedGreenhouse Bluetooth enabled.");
    }

    public void checkSignal() {
        System.out.println("AutomatedGreenhouse signal checked.");
    }
}

package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class IrrigationPump implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("IrrigationPump powered on.");
    }
    public void powerOff() {
        System.out.println("IrrigationPump powered off.");
    }
    public void connect() {
        System.out.println("IrrigationPump connected to network.");
    }
    public void enableWiFi() {
        System.out.println("IrrigationPump WiFi enabled.");
    }
    public void enableBluetooth() {
        System.out.println("IrrigationPump Bluetooth enabled.");
    }
    public void checkSignal() {
        System.out.println("IrrigationPump signal checked.");
    }

}

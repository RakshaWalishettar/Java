package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class PatrolDrone implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("PatrolDrone powered on.");
    }
    public void powerOff() {
        System.out.println("PatrolDrone powered off.");
    }
    public void connect() {
        System.out.println("PatrolDrone connected to network.");
    }
    public void enableWiFi() {
        System.out.println("PatrolDrone WiFi enabled.");
    }
    public void enableBluetooth() {
        System.out.println("PatrolDrone Bluetooth enabled.");
    }
    public void checkSignal() {
        System.out.println("PatrolDrone signal checked.");
    }


}

package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class RobotDog implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("RobotDog powered on.");
    }
    public void powerOff() {
        System.out.println("RobotDog powered off.");
    }
    public void connect() {
        System.out.println("RobotDog connected to network.");
    }
    public void enableWiFi() {
        System.out.println("RobotDog WiFi enabled.");
    }
    public void enableBluetooth() {
        System.out.println("RobotDog Bluetooth enabled.");
    }
    public void checkSignal() {
        System.out.println("RobotDog signal checked.");
    }
}

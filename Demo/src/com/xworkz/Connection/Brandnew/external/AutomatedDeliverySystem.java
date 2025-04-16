package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class AutomatedDeliverySystem implements SmartDevice, Connectivity {
    public void powerOn() {
        System.out.println("AutomatedDeliverySystem powered on.");
    }

    public void powerOff() {
        System.out.println("AutomatedDeliverySystem powered off.");
    }

    public void connect() {
        System.out.println("AutomatedDeliverySystem connected to network.");
    }

    public void enableWiFi() {
        System.out.println("AutomatedDeliverySystem WiFi enabled.");
    }

    public void enableBluetooth() {
        System.out.println("AutomatedDeliverySystem Bluetooth enabled.");
    }

    public void checkSignal() {
        System.out.println("AutomatedDeliverySystem signal checked.");
    }

}

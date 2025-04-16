package com.xworkz.Connection.Brandnew.external;

import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal2.Connectivity;

public class DeliveryBot implements SmartDevice,Connectivity {
    public void powerOn() {
        System.out.println("DeliveryBot powered on.");
    }
    public void powerOff() {
        System.out.println("DeliveryBot powered off.");
    }
    public void connect() {
        System.out.println("DeliveryBot connected to network.");
    }
    public void enableWiFi() {
        System.out.println("DeliveryBot WiFi enabled.");
    }
    public void enableBluetooth() {
        System.out.println("DeliveryBot Bluetooth enabled.");
    }

    @Override
    public void checkSignal() {
        System.out.println("DeliveryBot signal checked.");
    }
}

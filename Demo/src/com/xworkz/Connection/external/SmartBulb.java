package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.SmartDevice;

public class SmartBulb implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart bulb turned on.");
    }
    public void adjustSetting() {
        System.out.println("Brightness adjusted.");
    }
    public void turnOff() {
        System.out.println("Smart bulb turned off.");
    }
    @Override
    public void switchButton() {
        System.out.println("Welcome!");
    }
}

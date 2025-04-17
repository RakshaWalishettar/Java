package com.xworkz.Connection.Brandnew.Runner;

import com.xworkz.Connection.Brandnew.external.RobotDog;
import com.xworkz.Connection.Brandnew.internal1.SmartDevice;
import com.xworkz.Connection.Brandnew.internal1.Connectivity;

public class RobotDogRunner {
    public static void main(String[] args) {
        SmartDevice device = new RobotDog();
        device.powerOn();
        device.connect();
        device.powerOff();

        Connectivity conn = new RobotDog();
        conn.enableWiFi();
        conn.enableBluetooth();
        conn.checkSignal();
    }
}

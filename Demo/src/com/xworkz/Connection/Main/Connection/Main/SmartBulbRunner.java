package com.xworkz.Connection.Main.Connection.Main;

import com.xworkz.Connection.external.SmartBulb;
import com.xworkz.Connection.internal.SmartDevice;

public class SmartBulbRunner {
    public static void main(String[] args) {
        SmartDevice bulb = new SmartBulb();
        bulb.turnOn();
        bulb.adjustSetting();
        bulb.turnOff();
    }
}

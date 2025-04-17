package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.PowerTool;

public class DrillMachine implements PowerTool {
    public void turnOn() {
        System.out.println("Drill machine turned on.");
    }

    public void drill() {
        System.out.println("Drilling in progress...");
    }

    public void turnOff() {
        System.out.println("Drill machine turned off.");
    }
    @Override
    public void machine() {
        System.out.println("Welcome, how  can i help.");
    }

}

package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.DrillMachine;
import com.xworkz.Connection.internal.PowerTool;

public class DrillMachineRunner {
    public static void main(String[] args) {
        PowerTool tool = new DrillMachine();
        tool.turnOn();
        tool.drill();
        tool.turnOff();
        tool.machine();
    }
}

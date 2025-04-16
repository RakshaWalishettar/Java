package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.BikeMechanic;
import com.xworkz.Connection.internal.Mechanic;

public class BikeMachineRunner {
    public static void main(String[] args) {
        Mechanic m = new BikeMechanic();
        m.inspect();
        m.repair();
        m.testDrive();
    }
}

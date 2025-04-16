package com.xworkz.Connection.Main.Connection.external;

import com.xworkz.Connection.internal.WashingMachine;

public class LGWasher implements WashingMachine {
    public void startWash() {
        System.out.println("Washing started.");
    }
    public void rinse() {
        System.out.println("Rinsing clothes...");
    }
    public void spin() {
        System.out.println("Spinning at high speed.");
    }
}

package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.GameConsole;

public class PlayStation implements GameConsole {
    public void powerOn() {
        System.out.println("PlayStation powered on.");
    }

    public void playGame() {
        System.out.println("Game started on PlayStation.");
    }

    public void powerOff() {
        System.out.println("PlayStation powered off.");
    }
}

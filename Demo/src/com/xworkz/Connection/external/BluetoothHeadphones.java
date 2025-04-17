package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.Headphones;

public class BluetoothHeadphones implements Headphones {
    public void connectBluetooth() {
        System.out.println("Headphones connected via Bluetooth.");
    }

    public void playAudio() {
        System.out.println("Playing audio...");
    }

    public void disconnect() {
        System.out.println("Bluetooth disconnected.");
    }
    @Override
    public void greetUser() {
        System.out.println("Welcome! Ready to enjoy your music.");
    }

}

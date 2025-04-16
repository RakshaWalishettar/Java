package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.NetworkDevice;

public class Router implements NetworkDevice {
    public void connect() {
        System.out.println("Router connected.");
    }

    public void sendData() {
        System.out.println("Data is being transmitted.");
    }

    public void disconnect() {
        System.out.println("Router disconnected.");
    }
}

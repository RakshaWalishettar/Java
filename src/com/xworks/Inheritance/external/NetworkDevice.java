package com.xworks.Inheritance.external;

public class NetworkDevice {
    public void powerOn() {
        System.out.println("NetworkDevice is powering on.");
    }

    public void powerOff() {
        System.out.println("NetworkDevice is shutting down.");
    }

    public void connect() {
        System.out.println("NetworkDevice is connecting to the network.");
    }

    public void disconnect() {
        System.out.println("NetworkDevice is disconnecting from the network.");
    }

    public void reset() {
        System.out.println("NetworkDevice is resetting.");
    }
}

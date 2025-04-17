package com.xworkz.Connection.internal;

public interface NetworkDevice {
    void connect();
    void sendData();
    void disconnect();
    default void recive() {
        System.out.println("Welcome!");
    }
}

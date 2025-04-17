package com.xworkz.Connection.internal;

public interface Database {
    void connect();
    void query();
    void disconnect();
    default void store() {
        System.out.println("Welcome!");
    }
}

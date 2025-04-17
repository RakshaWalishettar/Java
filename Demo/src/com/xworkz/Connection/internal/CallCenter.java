package com.xworkz.Connection.internal;

public interface CallCenter {
    void receiveCall();
    void resolveIssue();
    void endCall();
    default void irration() {
        System.out.println("Welcome!");
    }

}

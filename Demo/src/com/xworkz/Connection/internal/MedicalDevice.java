package com.xworkz.Connection.internal;

public interface MedicalDevice {
    void startMonitoring();
    void recordData();
    void stopMonitoring();
    default void hospital() {
        System.out.println("Welcome!");
    }
}

package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.MedicalDevice;

public class HeartMonitor implements MedicalDevice {
    public void startMonitoring() {
        System.out.println("Monitoring heart rate...");
    }

    public void recordData() {
        System.out.println("Recording heart data...");
    }

    public void stopMonitoring() {
        System.out.println("Stopped monitoring.");
    }
    @Override
    public void hospital() {
        System.out.println("Welcome!");
    }
}

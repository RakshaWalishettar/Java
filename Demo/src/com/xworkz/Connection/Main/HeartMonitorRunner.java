package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.HeartMonitor;
import com.xworkz.Connection.internal.MedicalDevice;

public class HeartMonitorRunner {
    public static void main(String[] args) {
        MedicalDevice device = new HeartMonitor();
        device.startMonitoring();
        device.recordData();
        device.stopMonitoring();
    }
}

package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Monitor;

public class MonitorUser {
    private Monitor monitor;
    public MonitorUser(Monitor monitor) {
        this.monitor = monitor;
        System.out.println("MonitorUser initialized");
    }
    public void execute() {
        System.out.println("Monitoring system...");
        if (this.monitor != null) {
            this.monitor.monitor();
        } else {
            System.out.println("not monitoring");
        }
    }
}

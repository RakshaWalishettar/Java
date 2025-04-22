package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.MonitorUser;
import com.xworkz.Implement.internal.Monitor;
import com.xworkz.Implement.internal.PerformanceMonitor;

public class MonitorRunner {
    public static void main(String[] args) {
        Monitor monitor = new PerformanceMonitor();
        MonitorUser user = new MonitorUser(monitor);
        user.execute();
    }
}

package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.OperatingSystem;

public class WindowsOS implements OperatingSystem {
    public void boot() {
        System.out.println("Windows is booting up...");
    }

    public void runProcess() {
        System.out.println("Running Windows process...");
    }

    public void shutdown() {
        System.out.println("Windows is shutting down...");
    }

}

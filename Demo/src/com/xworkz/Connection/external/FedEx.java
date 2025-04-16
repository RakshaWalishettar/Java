package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.Logistics;

public class FedEx implements Logistics {
    public void dispatch() {
        System.out.println("Package dispatched.");
    }

    public void track() {
        System.out.println("Tracking package in transit...");
    }

    public void deliver() {
        System.out.println("Package delivered to destination.");
    }
}

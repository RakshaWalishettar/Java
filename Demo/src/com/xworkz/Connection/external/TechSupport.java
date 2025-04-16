package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.CallCenter;

public class TechSupport implements CallCenter {
    public void receiveCall() {
        System.out.println("Call received from customer.");
    }

    public void resolveIssue() {
        System.out.println("Issue resolved over call.");
    }

    public void endCall() {
        System.out.println("Call ended.");
    }
}

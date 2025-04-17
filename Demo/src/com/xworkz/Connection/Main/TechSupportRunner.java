package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.TechSupport;
import com.xworkz.Connection.internal.CallCenter;

public class TechSupportRunner {
    public static void main(String[] args) {
        CallCenter c = new TechSupport();
        c.receiveCall();
        c.resolveIssue();
        c.endCall();
        c.irration();
    }
}

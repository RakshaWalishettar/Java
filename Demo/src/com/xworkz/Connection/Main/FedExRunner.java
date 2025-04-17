package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.FedEx;
import com.xworkz.Connection.internal.Logistics;

public class FedExRunner {
    public static void main(String[] args) {
        Logistics l = new FedEx();
        l.dispatch();
        l.track();
        l.deliver();
        l.Package();
    }
}

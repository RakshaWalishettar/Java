package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.NetworkDevice;
import com.xworks.Inheritance.external.Router;

public class RouterRunner {
    public static void main(String[] args) {
        Router router = new Router();
        router.reset();
        router.powerOn();
        router.powerOff();
        router.connect();
        router.disconnect();
        router.connect();

        System.out.println("============================================");
        NetworkDevice device = new NetworkDevice();
        device.reset();
        device.connect();
        device.disconnect();
        device.powerOn();
        device.powerOff();
    }
}

package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.DJIPhantom;
import com.xworkz.Connection.internal.Drone;

public class DJIPhantomRunner {
    public static void main(String[] args) {
        Drone drone = new DJIPhantom();
        drone.takeOff();
        drone.fly();
        drone.land();
    }
}

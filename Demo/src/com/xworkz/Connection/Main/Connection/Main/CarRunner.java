package com.xworkz.Connection.Main.Connection.Main;

import com.xworkz.Connection.external.Car;
import com.xworkz.Connection.internal.Vehicle;

public class CarRunner {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.startEngine();
        myCar.accelerate();
        myCar.stopEngine();
    }
}

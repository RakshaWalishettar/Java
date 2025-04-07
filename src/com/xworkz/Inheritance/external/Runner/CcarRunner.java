package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Ccar;
import com.xworks.Inheritance.external.Electriccar;
import com.xworks.Inheritance.external.Headlight;

public class CcarRunner {
    public static void main(String[] args){
        Ccar car=new Ccar();
        car.echomode();
        car.displayinfo();
        car.speed();
        car.chargingbattery();
        car.stop();

        System.out.println("==============================");
        Electriccar EC=new Electriccar();
        EC.echomode();
        EC.speed();
        EC.stop();
        EC.chargingbattery();
        EC.displayinfo();

        System.out.println("=================================");
        Headlight headlight=new Headlight();
        headlight.mirror(headlight);
        headlight.mirror(car);
    }
}

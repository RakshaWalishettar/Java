package com.xworks.Inheritance.external;

public class Headlight extends Ccar{
    public void yellow() {
        System.out.println("yellow light ");
    }
    public void mirror(Ccar ccar){
        ccar.displayinfo();
        ccar.stop();
        ccar.chargingbattery();
        ccar.speed();
        ccar.echomode();

        if(ccar instanceof Headlight){
            Headlight headlight=(Headlight) ccar;
            System.out.println("headlight is the instance of electriccar");
            headlight.yellow();

        }
    }
}

package com.xworks.Inheritance.external;

public class Ccar extends Electriccar{
    public void ccar()
    {
        System.out.println("no-args const of car");
    }
    {
        super.speed();
        System.out.println("runner speed of car");
    }
    {
        super.echomode();
        System.out.println("runner echomode of car");
    }
    {
        super.displayinfo();
        System.out.println("runner displayinfo of car");
    }
    {
        super.chargingbattery();
        System.out.println("runner chargingbattery of car");
    }
    {
        super.stop();
        System.out.println("runner stop of car");
    }
}

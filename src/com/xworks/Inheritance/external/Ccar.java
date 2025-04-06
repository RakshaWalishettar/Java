package com.xworks.Inheritance.external;

public class Ccar extends Electriccar{
    public Ccar()
    {
        System.out.println("no-args const of car");
    }
    @Override
    public void speed(){
        System.out.println("runner speed of car");
    }
    @Override
    public void echomode(){
        System.out.println("runner echomode of car");
    }
    @Override
    public void displayinfo(){
        System.out.println("runner displayinfo of car");
    }
    @Override
    public void chargingbattery(){
        System.out.println("runner chargingbattery of car");
    }@Override
    public  void stop(){
        System.out.println("runner stop of car");
    }
}

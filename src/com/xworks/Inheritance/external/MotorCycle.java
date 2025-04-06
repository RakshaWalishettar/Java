package com.xworks.Inheritance.external;

public class MotorCycle extends Sportsbike {
    public MotorCycle()
    {
        System.out.println("no-args const of car");
    }
    @Override
    public void turboBoost(){
        System.out.println("runner openCargoBed of truck");
    }
    @Override
    public void leanIntoCurve(){
        System.out.println("runner closeCargoBed of truck");
    }
    @Override
    public void quickShift(){
        System.out.println("runner toggleCover of truck");
    }
    @Override
    public void launchControl(){
        System.out.println("runner enableOffRoadMode of truck");
    }
    @Override
    public void raceMode(){
        System.out.println("runner towTrailer of truck");
    }
}

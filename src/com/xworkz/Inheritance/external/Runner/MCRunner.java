package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.MotorCycle;
import com.xworks.Inheritance.external.Sportsbike;

public class MCRunner {
    public static void main(String[] args){
        MotorCycle motorCycle=new MotorCycle();
        motorCycle.turboBoost();
        motorCycle.raceMode();
        motorCycle.quickShift();
        motorCycle.leanIntoCurve();
        motorCycle.launchControl();

        System.out.println("====================================");
        Sportsbike sportsbike=new Sportsbike();
        sportsbike.turboBoost();
        sportsbike.raceMode();
        sportsbike.quickShift();
        sportsbike.launchControl();
        sportsbike.leanIntoCurve();
    }
}

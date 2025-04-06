package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.SmartGadget;
import com.xworks.Inheritance.external.SmartWatch;

public class SmartWatchRunner {
    public static void main(String[] args){
        SmartGadget smartGadget=new SmartGadget();
        smartGadget.trackSteps();
        smartGadget.showTime();
        smartGadget.receiveNotifications();
        smartGadget.monitorHeartRate();
        smartGadget.chargeBattery();

        System.out.println("====================================");
        SmartWatch smartWatch=new SmartWatch();
        smartWatch.trackSteps();
        smartWatch.showTime();
        smartWatch.chargeBattery();
        smartWatch.receiveNotifications();
        smartWatch.monitorHeartRate();
    }
}

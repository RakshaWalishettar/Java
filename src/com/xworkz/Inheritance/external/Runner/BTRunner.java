package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.BulletTrain;
import com.xworks.Inheritance.external.Map;
import com.xworks.Inheritance.external.Schedule;

public class BTRunner {
    public static void main(String[] args) {
        Schedule schedule1 = new Schedule();
        schedule1.startJourney();
        schedule1.slowDown();
        schedule1.reachHighSpeed();
        schedule1.passTunnels();
        schedule1.stopAtStation();

        System.out.println("=======================");
        BulletTrain bulletTrain=new BulletTrain();
        bulletTrain.stopAtStation();
        bulletTrain.passTunnels();
        bulletTrain.slowDown();
        bulletTrain.reachHighSpeed();
        bulletTrain.startJourney();

        System.out.println("==========================");
        Map map=new Map();
        map.roadMap(schedule1);
        map.startJourney();
        map.stopAtStation();
        map.slowDown();
        map.reachHighSpeed();
        map.passTunnels();
    }
}

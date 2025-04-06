package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Bicycle;
import com.xworks.Inheritance.external.RoadVehical;

import java.awt.*;

public class BicycleRunner {
    public static void main(String[] args) {
        RoadVehical vehicle1 = new RoadVehical();
        vehicle1.stop();
        vehicle1.load();
        vehicle1.fuel();
        vehicle1.move();
        vehicle1.maintain();

        System.out.println("==============");

        Bicycle bicycle=new Bicycle();
        bicycle.maintain();
        bicycle.stop();
        bicycle.move();
        bicycle.fuel();
        bicycle.load();
    }
}

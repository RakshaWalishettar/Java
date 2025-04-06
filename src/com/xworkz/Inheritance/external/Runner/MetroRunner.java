package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.MetroTrain;
import com.xworks.Inheritance.external.Train;

public class MetroRunner {
public static void main(String[] args){
    Train train=new Train();
    train.stopAtStation();
    train.startJourney();
    train.announceArrival();
    train.accelerate();
    train.decelerate();

    System.out.println("=========================================");
    MetroTrain metroTrain=new MetroTrain();
    metroTrain.startJourney();
    metroTrain.stopAtStation();
    metroTrain.announceArrival();
    metroTrain.accelerate();
    metroTrain.decelerate();
}
}

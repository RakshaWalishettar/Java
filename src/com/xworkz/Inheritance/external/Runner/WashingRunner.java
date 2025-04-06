package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Appliance;
import com.xworks.Inheritance.external.Washingmachine;

public class WashingRunner {
    public static void main(String[] args) {
        Washingmachine washingmachine = new Washingmachine();
        washingmachine.rinse();
        washingmachine.drain();
        washingmachine.spin();
        washingmachine.beep();
        washingmachine.wash();


        System.out.println("==============================");
        Appliance appliance1 = new Appliance();
        appliance1.beep();
        appliance1.wash();
        appliance1.rinse();
        appliance1.drain();
        appliance1.spin();
    }
}

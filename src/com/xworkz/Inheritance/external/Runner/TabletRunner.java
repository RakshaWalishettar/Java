package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Antibiotic;
import com.xworks.Inheritance.external.Tablet;

public class TabletRunner {
    public static void main(String [] args){
        Antibiotic antibiotic=new Antibiotic();
        antibiotic.treatInfections();
        antibiotic.reduceFever();
        antibiotic.manageDosage();
        antibiotic.killBacteria();
        antibiotic.increaseImmunity();

        System.out.println("==============================");
        Tablet tablet= new Tablet();
        tablet.treatInfections();
        tablet.reduceFever();
        tablet.manageDosage();
        tablet.killBacteria();
        tablet.increaseImmunity();
    }
}

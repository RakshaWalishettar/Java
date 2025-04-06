package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.HRManager;
import com.xworks.Inheritance.external.Managerrrr;

public class MRunner {
    public static void main(String [] args){
        HRManager hr=new HRManager();
        hr.hireEmployee();
        hr.approveLeave();
        hr.assignTask();
        hr.conductMeeting();
        hr.conductTraining();

        System.out.println("=============================");
        Managerrrr mange=new Managerrrr();
        mange.approveLeave();
        mange.assignTask();
        mange.conductMeeting();
        mange.conductTraining();
        mange.hireEmployee();
    }
}

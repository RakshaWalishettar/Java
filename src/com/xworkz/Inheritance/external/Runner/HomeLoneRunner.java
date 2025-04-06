package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.HomeLone;
import com.xworks.Inheritance.external.Lone;

public class HomeLoneRunner {
    public static void main(String[] args){
        Lone lone=new Lone();
        lone.total_monthly_cost();
        lone.calculate_equity();
        lone.sign();
        lone.property_tax();
        lone.refinance();

        System.out.println("=================================");
        HomeLone homeLone=new HomeLone();
        homeLone.total_monthly_cost();
        homeLone.refinance();
        homeLone.property_tax();
        homeLone.calculate_equity();
        homeLone.sign();
    }
}

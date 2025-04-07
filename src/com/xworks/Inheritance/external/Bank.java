package com.xworks.Inheritance.external;

public class Bank extends Lone{
    public void natianlbank(){
        System.out.println("the loan is the bank");
    }
    public void applyloan(Lone lone){
        lone.sign();
        lone.refinance();
        lone.calculate_equity();
        lone.property_tax();
        lone.total_monthly_cost();

        if(lone instanceof Bank){
            Bank bank=(Bank) lone;
            System.out.println("the instance of the bank is lone");
            bank.natianlbank();
        }

    }

}

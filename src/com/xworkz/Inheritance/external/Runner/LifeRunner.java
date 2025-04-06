package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Insurance;
import com.xworks.Inheritance.external.LifeInsurance;

public class LifeRunner {
public static void main(String [] args){
    Insurance insurance=new Insurance();
    insurance.terminatePolicy();
    insurance.renewPolicy();
    insurance.issuePolicy();
    insurance.claimPolicy();
    insurance.calculatePremium();

    System.out.println("==========================================");
    LifeInsurance lifeInsurance=new LifeInsurance();
    lifeInsurance.renewPolicy();
    lifeInsurance.issuePolicy();
    lifeInsurance.claimPolicy();
    lifeInsurance.terminatePolicy();
    lifeInsurance.calculatePremium();
}
}

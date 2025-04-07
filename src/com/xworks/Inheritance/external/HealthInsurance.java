package com.xworks.Inheritance.external;

public class HealthInsurance extends Security{
    public HealthInsurance(){
        System.out.println("no arg const of health");
    }@Override
    public void coverMedicalExpense(){
        System.out.println("HealthInsurance: Covering medical expenses with specific policy.");
    }@Override
    public void claimHospitalBills(){
        System.out.println("HealthInsurance: Claiming hospital bills with required documentation.");
    }@Override
    public void payPremium(){
        System.out.println("HealthInsurance: Paying premium on time to avoid policy lapse.");
    }@Override
    public void renewPolicy(){
        System.out.println("HealthInsurance: Renewing policy for continued coverage.");
    }
    @Override
    public void getReimbursement(){
        System.out.println("HealthInsurance: Processing reimbursement after claim approval.");
    }
    public void precaustion(){
        System.out.println("the precaution is must");
    }
}

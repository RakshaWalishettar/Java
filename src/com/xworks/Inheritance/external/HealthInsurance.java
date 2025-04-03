package com.xworks.Inheritance.external;

public class HealthInsurance extends Security{
    public void health(){
        System.out.println("no arg const of health");
    }
    {
        super.coverMedicalExpense();
        System.out.println("HealthInsurance: Covering medical expenses with specific policy.");
    }
    {
        super. claimHospitalBills();
        System.out.println("HealthInsurance: Claiming hospital bills with required documentation.");
    }
    {
        super.payPremium();
        System.out.println("HealthInsurance: Paying premium on time to avoid policy lapse.");
    }
    {
        super.renewPolicy();
        System.out.println("HealthInsurance: Renewing policy for continued coverage.");
    }

    {
        super.getReimbursement();
        System.out.println("HealthInsurance: Processing reimbursement after claim approval.");
    }
}

package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Clinical;
import com.xworks.Inheritance.external.HealthInsurance;
import com.xworks.Inheritance.external.Security;

public class HealthRunner {
    public static void main(String[] args){
        Security security=new Security();
        security.renewPolicy();
        security.payPremium();
        security.getReimbursement();
        security.claimHospitalBills();
        security.coverMedicalExpense();

        System.out.println("================================");
        HealthInsurance healthInsurance=new HealthInsurance();
        healthInsurance.renewPolicy();
        healthInsurance.payPremium();
        healthInsurance.getReimbursement();
        healthInsurance.claimHospitalBills();
        healthInsurance.coverMedicalExpense();

        System.out.println("=============================");
        Clinical clinical=new Clinical();
        clinical.precaustion(security);
        clinical.precaustion(clinical);
    }
}

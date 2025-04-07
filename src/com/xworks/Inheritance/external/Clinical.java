package com.xworks.Inheritance.external;

public class Clinical extends Security{
    public void admit(){
        System.out.println("the clinical can admit patient");
    }
    public void precaustion(Security security){
        security.coverMedicalExpense();
        security.renewPolicy();
        security.payPremium();
        security.getReimbursement();
        security.claimHospitalBills();

        if(security instanceof Clinical){
            Clinical clinical=(Clinical) security;
            System.out.println("the instance of the clinical is security");
            clinical.admit();
        }
    }
}

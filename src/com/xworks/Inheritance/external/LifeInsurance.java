package com.xworks.Inheritance.external;

public class LifeInsurance extends Insurance{
    public void issuePolicy() {
        super.issuePolicy();
        System.out.println("Issuing a life insurance policy.");
    }

    public void calculatePremium() {
        super.calculatePremium();
        System.out.println("Calculating premium for life insurance.");
    }

    public void claimPolicy() {
        super.claimPolicy();
        System.out.println("Processing life insurance claim.");
    }

    public void terminatePolicy() {
        super.terminatePolicy();
        System.out.println("Terminating life insurance policy.");
    }

    public void renewPolicy() {
        super.renewPolicy();
        System.out.println("Renewing life insurance policy.");
    }
}

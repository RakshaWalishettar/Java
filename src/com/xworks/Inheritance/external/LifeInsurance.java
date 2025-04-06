package com.xworks.Inheritance.external;

public class LifeInsurance extends Insurance{
    public LifeInsurance(){
        System.out.println("no arg const ");
    }@Override
    public void issuePolicy() {
        System.out.println("Issuing a life insurance policy.");
    }
    @Override
    public void calculatePremium() {
        System.out.println("Calculating premium for life insurance.");
    }
    @Override
    public void claimPolicy() {
        System.out.println("Processing life insurance claim.");
    }
    @Override
    public void terminatePolicy() {
        System.out.println("Terminating life insurance policy.");
    }
    @Override
    public void renewPolicy() {
        System.out.println("Renewing life insurance policy.");
    }
}

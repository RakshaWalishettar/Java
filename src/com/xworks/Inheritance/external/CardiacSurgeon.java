package com.xworks.Inheritance.external;

public class CardiacSurgeon extends Surgeon {
    public CardiacSurgeon() {
        System.out.println("no-args const in CS");
    }
    @Override
    public void performSurgery() {
        System.out.println("Performing heart surgery.");
    }
    @Override
    public void conductHeartTransplant() {
        System.out.println("Conducting heart transplant surgery.");
    }
    @Override
    public void interpretECG() {
        System.out.println("Interpreting ECG results.");
    }
    @Override
    public void performBypassSurgery() {
        System.out.println("Performing coronary artery bypass surgery.");
    }
    @Override
    public void monitorCardiacPatients() {
        System.out.println("Monitoring post-surgery cardiac patients.");
    }
}

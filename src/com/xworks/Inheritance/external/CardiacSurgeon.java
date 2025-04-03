package com.xworks.Inheritance.external;

public class CardiacSurgeon extends Surgeon {
    public void CS() {
        System.out.println("no-args const in CS");
        {
            super.performSurgery();
            System.out.println("Performing heart surgery.");
        }
        {
            super.conductHeartTransplant();
            System.out.println("Conducting heart transplant surgery.");
        }
        {
            super.interpretECG();
            System.out.println("Interpreting ECG results.");
        }
        {
            super.performBypassSurgery();
            System.out.println("Performing coronary artery bypass surgery.");
        }
        {
            super.monitorCardiacPatients();
            System.out.println("Monitoring post-surgery cardiac patients.");
        }
    }
}

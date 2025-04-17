package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.Laboratory;

public class BloodTestLab implements Laboratory {
    public void collectSample() {
        System.out.println("Blood sample collected.");
    }

    public void testSample() {
        System.out.println("Blood sample tested.");
    }

    public void generateReport() {
        System.out.println("Lab report generated.");
    }
    @Override
    public void greetPatient() {
        System.out.println("Welcome to the Laboratory. Please follow safety protocols.");
    }

}

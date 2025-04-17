package com.xworkz.Connection.internal;

public interface Laboratory {
    void collectSample();
    void testSample();
    void generateReport();
    default void greetPatient() {
        System.out.println("Welcome to the Laboratory. Please follow safety protocols.");
    }

}

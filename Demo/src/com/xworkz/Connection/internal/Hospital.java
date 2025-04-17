package com.xworkz.Connection.internal;

public interface Hospital {
    void admitPatient();
    void treatPatient();
    void dischargePatient();
    default void greatHospital() {
        System.out.println("Welcome, how  can i help.");
    }
}

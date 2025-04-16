package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.Hospital;

public class CityHospital implements Hospital {
    public void admitPatient() {
        System.out.println("Patient admitted.");
    }

    public void treatPatient() {
        System.out.println("Patient is being treated.");
    }

    public void dischargePatient() {
        System.out.println("Patient discharged.");
    }
}

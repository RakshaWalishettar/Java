package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.GovernmentHospital;
import com.xworks.Inheritance.external.Hospital;

public class GHRunner {
    public static void main(String[] args){
        Hospital hospital=new Hospital();
        hospital.provideTreatment();
        hospital.manageStaff();
        hospital.admitPatient();
        hospital.dischargePatient();
        hospital.maintainRecords();

        System.out.println("==================================");
        GovernmentHospital governmentHospital=new GovernmentHospital();
        governmentHospital.admitPatient();
        governmentHospital.maintainRecords();
        governmentHospital.dischargePatient();
        governmentHospital.manageStaff();
        governmentHospital.provideTreatment();
    }
}

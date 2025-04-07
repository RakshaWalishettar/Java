package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.GovernmentHospital;
import com.xworks.Inheritance.external.Hospital;
import com.xworks.Inheritance.external.Nurse;

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

        System.out.println("========================");
        Nurse nurse=new Nurse();
        nurse.clean(hospital);
        nurse.clean(nurse);
    }
}

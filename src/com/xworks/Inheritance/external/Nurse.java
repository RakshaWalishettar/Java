package com.xworks.Inheritance.external;

public class Nurse extends Hospital{
    public void injection(){
        System.out.println("the hospital has the nurse");
    }
    public void clean(Hospital hospital){
        hospital.maintainRecords();
        hospital.admitPatient();
        hospital.dischargePatient();
        hospital.provideTreatment();
        hospital.manageStaff();

        if(hospital instanceof Nurse){
            Nurse nurse=(Nurse) hospital;
            System.out.println("the instance of the nurse is hospital");
            nurse.injection();
        }
    }

}

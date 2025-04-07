package com.xworks.Inheritance.external;

public class Rootcanal extends Doctor{
    public void clip(){
        System.out.println("the clip is placed to the mouth");
    }
    public void operate(Doctor doctor){
        doctor.prescribingMedicine();
        doctor.maintainingRecords();
        doctor.consulting();
        doctor.diagnosing();
        doctor.treatingPatients();

        if(doctor instanceof Rootcanal){
            Rootcanal rootcanal=(Rootcanal) doctor;
            System.out.println("the rootcanal is the instance of the doctor");
            rootcanal.clip();
        }
    }
}

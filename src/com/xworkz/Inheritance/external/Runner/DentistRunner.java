package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Dentist;
import com.xworks.Inheritance.external.Doctor;

public class DentistRunner {
    public static void main (String[] args){
        Doctor doctor=new Doctor();
        doctor.treatingPatients();
        doctor.prescribingMedicine();
        doctor.maintainingRecords();
        doctor.diagnosing();
        doctor.consulting();

        System.out.println("============================");
        Dentist dentist=new Dentist();
        dentist.prescribingMedicine();
        dentist.treatingPatients();
        dentist.maintainingRecords();
        dentist.consulting();
        dentist.diagnosing();
    }
}

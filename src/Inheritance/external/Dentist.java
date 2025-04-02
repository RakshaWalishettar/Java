package com.xworkz.inheritance.external;

public class Dentist extends Doctor{
    public Dentist() {
        super();
        System.out.println("No-args constructor of Dentist");
    }
    {
        super.treatingPatients();
        System.out.println("Dentist is treating dental patients");
    }
    {
        super.diagnosing();
        System.out.println("Dentist is diagnosing oral issues");
    }
    {
        super.prescribingMedicine();
        System.out.println("Dentist is prescribing dental medicines");
    }
    {
        super.consulting();
        System.out.println("Dentist is consulting about dental care");
    }
    {
        super.maintainingRecords();
        System.out.println("Dentist is maintaining dental patient records");
    }
}

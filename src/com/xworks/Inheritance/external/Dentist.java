package com.xworks.Inheritance.external;

public class Dentist extends Doctor{
    public void  dentist() {
        System.out.println("No-args constructor of Dentist");
    }@Override
    public void treatingPatients(){
        System.out.println("Dentist is treating dental patients");
    }@Override
    public void diagnosing(){
        System.out.println("Dentist is diagnosing oral issues");
    }@Override
    public void prescribingMedicine(){
        System.out.println("Dentist is prescribing dental medicines");
    }@Override
    public void consulting(){
        System.out.println("Dentist is consulting about dental care");
    }@Override
    public void maintainingRecords(){
        System.out.println("Dentist is maintaining dental patient records");
    }
}

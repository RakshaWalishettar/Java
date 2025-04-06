package com.xworks.Inheritance.external;

public class Staf extends Engineer{
    public Staf()
    {
        System.out.println("no-args const of staf");
    }
    @Override
    public void getSpecialization(){
        System.out.println("runner getSpecialization of staf");
    }
    @Override
    public void workOnProject(){
        System.out.println("runner workOnProject of staf");
    }
    @Override
    public void attendMeeting(){
        System.out.println("runner attendMeeting of staf");
    }
    @Override
    public void writeCode(){
        System.out.println("runner writeCode of staf");
    }
    @Override
    public void debugSoftware(){
        System.out.println("runner debugSoftware of staf");
    }
}

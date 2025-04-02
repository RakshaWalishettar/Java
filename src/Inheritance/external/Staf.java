package com.xworkz.inheritance.external;

public class Staf extends Engineer{
    public void staf()
    {
        System.out.println("no-args const of staf");
    }
    {
        super.getSpecialization();
        System.out.println("runner getSpecialization of staf");
    }
    {
        super.workOnProject();
        System.out.println("runner workOnProject of staf");
    }
    {
        super.attendMeeting();
        System.out.println("runner attendMeeting of staf");
    }
    {
        super.writeCode();
        System.out.println("runner writeCode of staf");
    }
    {
        super.debugSoftware();
        System.out.println("runner debugSoftware of staf");
    }
}

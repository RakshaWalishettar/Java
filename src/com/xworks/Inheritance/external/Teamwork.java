package com.xworks.Inheritance.external;

public class Teamwork extends Designer{
    public void TW()
    {
        System.out.println("no-args const of TM");
    }
    {
        super.designer();
        System.out.println("runner designer of teamwork");
    }
    {
        super.createDesign();
        System.out.println("runner createDesign of TM");
    }
    {
        super.reviseDesign();
        System.out.println("runner reviseDesign of TM");
    }
    {
        super.presentDesign();
        System.out.println("runner presentDesign of TM");
    }
    {
        super.collaborateWithDevelopers();
        System.out.println("runner collaborateWithDevelopers of TM");
    }
    {
        super.conductUserTesting();
        System.out.println("runner conductUserTesting of TM");
    }
}

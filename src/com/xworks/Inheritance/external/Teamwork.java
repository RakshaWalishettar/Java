package com.xworks.Inheritance.external;

public class Teamwork extends Designer{
    public Teamwork()
    {
        System.out.println("no-args const of TM");
    }@Override
    public void designer(){
        System.out.println("runner designer of teamwork");
    }@Override
    public void createDesign(){
        System.out.println("runner createDesign of TM");
    }@Override
    public void reviseDesign(){
        System.out.println("runner reviseDesign of TM");
    }@Override
    public void presentDesign(){
        System.out.println("runner presentDesign of TM");
    }@Override
    public void collaborateWithDevelopers(){
        System.out.println("runner collaborateWithDevelopers of TM");
    }@Override
    public void conductUserTesting(){
        System.out.println("runner conductUserTesting of TM");
    }
}

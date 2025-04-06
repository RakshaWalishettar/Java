package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Designer;
import com.xworks.Inheritance.external.Teamwork;

public class TMRunner {
    public static void main(String[] args){
        Designer designer=new Designer();
        designer.conductUserTesting();
        designer.reviseDesign();
        designer.presentDesign();
        designer.createDesign();
        designer.collaborateWithDevelopers();

        System.out.println("=====================");
        Teamwork teamwork=new Teamwork();
        teamwork.reviseDesign();
        teamwork.presentDesign();
        teamwork.conductUserTesting();
        teamwork.collaborateWithDevelopers();
        teamwork.createDesign();
    }
}

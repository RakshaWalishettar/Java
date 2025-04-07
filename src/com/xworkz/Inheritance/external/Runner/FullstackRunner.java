package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Developer;
import com.xworks.Inheritance.external.Fullstack;
import com.xworks.Inheritance.external.Java;

public class FullstackRunner {
    public static void main(String [] args){
        Developer developer=new Developer();
        developer.performTesting();
        developer.manageDevOps();
        developer.collaborateWithTeam();
        developer.developFrontend();
        developer.developBackend();

        System.out.println("=========================");
        Fullstack fullstack= new Fullstack();
        fullstack.developBackend();
        fullstack.developFrontend();
        fullstack.performTesting();
        fullstack.manageDevOps();
        fullstack.collaborateWithTeam();

        System.out.println("========================");

        Java java=new Java();
        java.course(developer);
        java.course(java);

    }
}

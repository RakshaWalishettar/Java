package com.xworks.Inheritance.external;

public class Java extends Developer{
    public void webdevelopment(){
        System.out.println("the java is the webdevelopment");
    }
    public void course(Developer developer){
        developer.developBackend();
        developer.developFrontend();
        developer.performTesting();
        developer.manageDevOps();
        developer.manageDevOps();

        if(developer instanceof Java){
            Java java=(Java) developer;
            System.out.println("the instance of the java is developer");
            java.webdevelopment();
        }
    }
}

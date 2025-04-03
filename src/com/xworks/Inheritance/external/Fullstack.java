package com.xworks.Inheritance.external;

public class Fullstack extends Developer{
    public void fullstack()
    {
        System.out.println("no-args const of fullstack");
    }
    {
        super.developer();
        System.out.println("runner designer of fullstack");
    }
    {
        super.developFrontend();
        System.out.println("runner developFrontend of fullstack");
    }
    {
        super.developBackend();
        System.out.println("runner developBackend of fullstack");
    }
    {
        super.manageDevOps();
        System.out.println("runner manageDevOps of fullstack");
    }
    {
        super.performTesting();
        System.out.println("runner performTesting of fullstack");
    }
    {
        super.collaborateWithTeam();
        System.out.println("runner collaborateWithTeam of fullstack");
    }
}

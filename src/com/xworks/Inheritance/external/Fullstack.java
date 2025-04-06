package com.xworks.Inheritance.external;

public class Fullstack extends Developer{
    public Fullstack()
    {
        System.out.println("no-args const of fullstack");
    }
    @Override
    public void developFrontend(){
        System.out.println("runner developFrontend of fullstack");
    }@Override
    public void developBackend(){
        System.out.println("runner developBackend of fullstack");
    }@Override
    public void manageDevOps(){
        System.out.println("runner manageDevOps of fullstack");
    }@Override
    public void performTesting(){
        System.out.println("runner performTesting of fullstack");
    }
    @Override
    public void collaborateWithTeam(){
        System.out.println("runner collaborateWithTeam of fullstack");
    }
}

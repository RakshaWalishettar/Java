package com.xworks.Inheritance.external;

public class Aves extends Birds{
    public Aves()
    {
        System.out.println("no-args const of Aves");
    }@Override
    public void fly(){
        System.out.println("runner fly of Aves");
    }
    @Override
    public void sing(){
        System.out.println("runner sing of Aves");
    }
    @Override
    public void buildNest(){
        System.out.println("runner buildNest of Aves");
    }
    @Override
    public void migrate(){
        System.out.println("runner migrate of Aves");
    }
    @Override
    public void eat(){
        System.out.println("runner eat of Aves");
    }
    public void sound(){
        System.out.println("runner nest of Aves");
    }
}

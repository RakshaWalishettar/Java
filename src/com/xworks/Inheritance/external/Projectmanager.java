package com.xworks.Inheritance.external;

public class Projectmanager extends GeneralManager{
    public Projectmanager()
    {
        System.out.println("no-args const of pm");
    }
    @Override
    public void gm(){
        System.out.println("runner designer of pm");
    }
    @Override
    public void manageResources(){
        System.out.println("runner manageResources of pm");
    }
    @Override
    public void conductMeetings(){
        System.out.println("runner conductMeetings of pm");
    }
    @Override
    public void approveBudget(){
        System.out.println("runner approveBudget of pm");
    }
    @Override
    public void overseeOperations(){
        System.out.println("runner overseeOperations of pm");
    }
    @Override
    public void evaluatePerformance(){
        System.out.println("runner evaluatePerformance of pm");
    }
}

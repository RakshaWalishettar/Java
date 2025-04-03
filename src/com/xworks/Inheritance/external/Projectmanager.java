package com.xworks.Inheritance.external;

public class Projectmanager extends GeneralManager{
    public void pm()
    {
        System.out.println("no-args const of pm");
    }
    {
        super.gm();
        System.out.println("runner designer of pm");
    }
    {
        super.manageResources();
        System.out.println("runner manageResources of pm");
    }
    {
        super.conductMeetings();
        System.out.println("runner conductMeetings of pm");
    }
    {
        super.approveBudget();
        System.out.println("runner approveBudget of pm");
    }
    {
        super.overseeOperations();
        System.out.println("runner overseeOperations of pm");
    }
    {
        super.evaluatePerformance();
        System.out.println("runner evaluatePerformance of pm");
    }
}

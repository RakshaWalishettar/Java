package com.xworks.Inheritance.external;

public class QualityAssurance extends Tester{
    public void QA()
    {
        System.out.println("no-args const of QA");
    }
    public void tester(){
        System.out.println("runner designer of QA");
    }@Override
    public void executeTestCases(){
        System.out.println("runner executeTestCases of QA");
    }@Override
    public void reportBugs(){
        System.out.println("runner reportBugs of QA");
    }@Override
    public void automateTesting(){
        System.out.println("runner automateTesting of QA");
    }@Override
    public void performRegressionTesting(){
        System.out.println("runner performRegressionTesting of QA");
    }@Override
    public void reviewRequirements(){
        System.out.println("runner reviewRequirements of QA");
    }
}

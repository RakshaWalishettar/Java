package com.xworkz.inheritance.external;

public class QualityAssurance extends Tester{
    public void QA()
    {
        System.out.println("no-args const of QA");
    }
    {
        super.tester();
        System.out.println("runner designer of QA");
    }
    {
        super.executeTestCases();
        System.out.println("runner executeTestCases of QA");
    }
    {
        super.reportBugs();
        System.out.println("runner reportBugs of QA");
    }
    {
        super.automateTesting();
        System.out.println("runner automateTesting of QA");
    }
    {
        super.performRegressionTesting();
        System.out.println("runner performRegressionTesting of QA");
    }
    {
        super.reviewRequirements();
        System.out.println("runner reviewRequirements of QA");
    }
}

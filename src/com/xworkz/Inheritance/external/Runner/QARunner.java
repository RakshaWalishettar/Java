package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.QualityAssurance;
import com.xworks.Inheritance.external.Tester;

public class QARunner {
    public static void main(String[] args){
        Tester tester=new Tester();
        tester.reviewRequirements();
        tester.reportBugs();
        tester.performRegressionTesting();
        tester.executeTestCases();
        tester.automateTesting();

        System.out.println("=============================================");
        QualityAssurance qualityAssurance=new QualityAssurance();
        qualityAssurance.performRegressionTesting();
        qualityAssurance.reviewRequirements();
        qualityAssurance.reportBugs();
        qualityAssurance.automateTesting();
        qualityAssurance.executeTestCases();
    }
}

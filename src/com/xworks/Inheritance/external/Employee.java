package com.xworks.Inheritance.external;

public class Employee extends Manager{
    public void employee()
    {
        System.out.println("no-args const of car");
    }
    {
        super.displayDetails();
        System.out.println("runner displayDetails of employe");
    }
    {
        super.getAnnualSalary();
        System.out.println("runner getAnnualSalary of employe");
    }
    {
        super.setSalary();
        System.out.println("runner setSalary of employe");
    }
    {
        super.workerDetails();
        System.out.println("runner workerDetails of employe");
    }
    {
        super.assignDepartment();
        System.out.println("runner assignDepartment of employe");
    }
}

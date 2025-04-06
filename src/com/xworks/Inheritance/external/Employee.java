package com.xworks.Inheritance.external;

public class Employee extends Manager{
    public Employee()
    {
        System.out.println("no-args const of car");
    }
    @Override
    public void displayDetails(){
        System.out.println("runner displayDetails of employe");
    }
    @Override
    public void getAnnualSalary(){
        System.out.println("runner getAnnualSalary of employe");
    }
    @Override
    public void setSalary(){
        System.out.println("runner setSalary of employe");
    }
    @Override
    public void workerDetails(){
        System.out.println("runner workerDetails of employe");
    }
    @Override
    public void assignDepartment(){
        System.out.println("runner assignDepartment of employe");
    }
}

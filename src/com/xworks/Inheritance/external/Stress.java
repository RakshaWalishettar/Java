package com.xworks.Inheritance.external;

public class Stress extends Manager{
    public void presser(){
        System.out.println("the employes has presser");
    }
    public void weekend(Manager manager){
        manager.setSalary();
        manager.assignDepartment();
        manager.displayDetails();
        manager.workerDetails();
        manager.getAnnualSalary();

        if(manager instanceof Stress){
            Stress stress=(Stress) manager;
            System.out.println("the stress instance of manager");
            stress.presser();
        }
    }
}

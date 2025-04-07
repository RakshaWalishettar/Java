package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Employee;
import com.xworks.Inheritance.external.Manager;
import com.xworks.Inheritance.external.Stress;

public class EmployeRunner {
    public static void main(String[] args){
        Employee employee=new Employee();
        employee.workerDetails();
        employee.assignDepartment();
        employee.displayDetails();
        employee.getAnnualSalary();
        employee.setSalary();

        System.out.println("=================================");
        Manager manager=new Manager();
        manager.assignDepartment();
        manager.displayDetails();
        manager.getAnnualSalary();
        manager.workerDetails();
        manager.setSalary();

        System.out.println("=================================");
        Stress stress=new Stress();
        stress.weekend(manager);
        stress.weekend(stress);
    }
}

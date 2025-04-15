package com.xworkz.Multilevelinheritance.internal;

public class Organization {
    void register() {
        System.out.println("Organization is registered");
    }
}

class Department extends Organization {
    void setBudget() {
        System.out.println("Department sets its budget");
    }
}

class HRDepartment extends Department {
    void hireEmployee() {
        System.out.println("HR department hires an employee");
    }

    public static void main(String[] args) {
        HRDepartment hr = new HRDepartment();
        hr.register();
        hr.setBudget();
        hr.hireEmployee();
    }
}

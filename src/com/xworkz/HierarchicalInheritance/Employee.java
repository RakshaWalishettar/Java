package com.xworkz.HierarchicalInheritance;

public class Employee {
    void login() {
        System.out.println("Employee logs into system");
    }
}

class Developer extends Employee {
    void writeCode() {
        System.out.println("Developer writes code");
    }
}

class Manager extends Employee {
    void conductMeeting() {
        System.out.println("Manager conducts team meeting");
    }

    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.login();
        dev.writeCode();

        Manager mgr = new Manager();
        mgr.login();
        mgr.conductMeeting();
    }
}

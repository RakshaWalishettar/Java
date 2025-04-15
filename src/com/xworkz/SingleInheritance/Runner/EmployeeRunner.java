package com.xworkz.SingleInheritance.Runner;

import com.xworkz.SingleInheritance.external.Developer;

public class EmployeeRunner {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.work();
        dev.writeCode();
    }
}

package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Company;
import com.xworks.Inheritance.external.ITCompany;

public class CompantRunner {
    public static void main(String[] args) {
        Company company = new ITCompany(); // Polymorphism
        Company company1 = new Company();
    }
}

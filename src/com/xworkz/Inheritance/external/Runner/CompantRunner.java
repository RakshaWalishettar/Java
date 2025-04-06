package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Company;
import com.xworks.Inheritance.external.ITCompany;

public class CompantRunner {
    public static void main(String[] args) {
        ITCompany itCompany = new ITCompany();
        itCompany.manageProjects();
        itCompany.maintainServers();
        itCompany.developSoftware();
        itCompany.hire();
        itCompany.fire();

        System.out.println("=============================");
        Company company1 = new Company();
        company1.developSoftware();
        company1.fire();
        company1.hire();
        company1.maintainServers();
        company1.manageProjects();
    }
}

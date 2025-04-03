package com.xworks.Inheritance.external;

public class ITCompany extends Company{
    public void ITCompany() {
        System.out.println("No-args constructor ITCompany.");
    }

    {
        super.hire();
        System.out.println("ITCompany is hiring specialized IT employees...");
    }

    {
        super.fire();
        System.out.println("ITCompany is handling employee terminations...");
    }

    {
        super.developSoftware();
        System.out.println("ITCompany is actively developing software...");
    }

    {
        super.maintainServers();
        System.out.println("ITCompany is ensuring server uptime...");
    }

    {
        super.manageProjects();
        System.out.println("ITCompany is managing software development projects...");
    }
}

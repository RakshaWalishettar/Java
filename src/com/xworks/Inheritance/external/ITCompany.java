package com.xworks.Inheritance.external;

public class ITCompany extends Company{
    public ITCompany() {
        System.out.println("No-args constructor ITCompany.");
    }
    @Override
    public void hire(){
        System.out.println("ITCompany is hiring specialized IT employees...");
    }
    @Override
    public void fire(){
        System.out.println("ITCompany is handling employee terminations...");
    }
    @Override
    public void developSoftware(){
        System.out.println("ITCompany is actively developing software...");
    }
    @Override
    public void maintainServers(){
        System.out.println("ITCompany is ensuring server uptime...");
    }
    @Override
    public void manageProjects(){
        System.out.println("ITCompany is managing software development projects...");
    }
    public void fungames(){
        System.out.println("runner the fungames");
    }
}

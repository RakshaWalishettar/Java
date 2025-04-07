package com.xworks.Inheritance.external;

public class Job extends Company {
    public  void fresher(){
        System.out.println("Company has the job for fresher");
    }
    public void fungames(Company company){
        company.developSoftware();
        company.maintainServers();
        company.developSoftware();
        company.fire();
        company.hire();
        company.manageProjects();

        if(company instanceof Job){
            Job job=(Job) company;
            System.out.println("job instance of company");
            job.fresher();
        }
    }
}

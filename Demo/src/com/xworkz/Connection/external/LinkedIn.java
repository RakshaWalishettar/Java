package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.JobPortal;

public class LinkedIn implements JobPortal {
    public void postJob() {
        System.out.println("Job posted on LinkedIn.");
    }
    public void applyJob() {
        System.out.println("Application submitted.");
    }
    public void scheduleInterview() {
        System.out.println("Interview scheduled.");
    }
    @Override
    public void fresher() {
        System.out.println("Welcome!");
    }
}

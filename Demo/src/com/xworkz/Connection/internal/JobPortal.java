package com.xworkz.Connection.internal;

public interface JobPortal {
    void postJob();
    void applyJob();
    void scheduleInterview();
    default void fresher() {
        System.out.println("Welcome!");
    }
}

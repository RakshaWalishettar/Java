package com.xworkz.Connection.internal;

public interface CleaningRobot {
    void startCleaning();
    void returnToDock();
    void emptyDustbin();
    default void machine() {
        System.out.println("Welcome!");
    }
}

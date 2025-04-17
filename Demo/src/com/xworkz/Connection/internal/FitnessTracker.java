package com.xworkz.Connection.internal;

public interface FitnessTracker {
    void startWorkout();
    void trackHeartRate();
    void endWorkout();
    default void gym() {
        System.out.println("Welcome!");
    }
}

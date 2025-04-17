package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.FitnessTracker;

public class Fitbit implements FitnessTracker {
    public void startWorkout() {
        System.out.println("Workout started on Fitbit.");
    }

    public void trackHeartRate() {
        System.out.println("Tracking heart rate on Fitbit.");
    }

    public void endWorkout() {
        System.out.println("Workout ended on Fitbit.");
    }
    @Override
    public void gym() {
        System.out.println("Welcome!");
    }
}

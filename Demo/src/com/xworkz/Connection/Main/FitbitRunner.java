package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.Fitbit;
import com.xworkz.Connection.internal.FitnessTracker;

public class FitbitRunner {
    public static void main(String[] args) {
        FitnessTracker tracker = new Fitbit();
        tracker.startWorkout();
        tracker.trackHeartRate();
        tracker.endWorkout();
        tracker.gym();
    }
}

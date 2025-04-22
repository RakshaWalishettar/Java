package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.TrackerUser;
import com.xworkz.Implement.internal.LocationTracker;
import com.xworkz.Implement.internal.Tracker;

public class TrackerRunner {
    public static void main(String[] args) {
        Tracker tracker = new LocationTracker();
        TrackerUser user = new TrackerUser(tracker);
        user.execute();
    }
}

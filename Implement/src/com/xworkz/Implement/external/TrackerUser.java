package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Scheduler;
import com.xworkz.Implement.internal.Tracker;

public class TrackerUser {
    private Tracker tracker;
    public TrackerUser(Tracker tracker) {
        this.tracker = tracker;
        System.out.println("TrackerUser ready");
    }
    public void execute() {
        System.out.println("Tracking location...");
        if (this.tracker != null) {
            this.tracker.track();
        } else {
            System.out.println("not tracking");
        }
    }
}

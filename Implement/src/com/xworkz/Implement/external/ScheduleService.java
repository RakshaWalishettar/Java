package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Scheduler;

public class ScheduleService {
    private Scheduler scheduler;
    public ScheduleService(Scheduler scheduler) {
        this.scheduler = scheduler;
        System.out.println("ScheduleService initialized");
    }
    public void execute() {
        System.out.println("Scheduling task...");
        if (this.scheduler != null) {
            this.scheduler.schedule();
        } else {
            System.out.println("no task");
        }
    }
}

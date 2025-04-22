package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.ScheduleService;
import com.xworkz.Implement.internal.Scheduler;
import com.xworkz.Implement.internal.TaskScheduler;

public class SchedulerRunner {
    public static void main(String[] args) {
        Scheduler scheduler = new TaskScheduler();
        ScheduleService service = new ScheduleService(scheduler);
        service.execute();
    }
}

package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Notifier;

public class NotificationService {
    private Notifier notifier;
    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
        System.out.println("NotificationService initialized");
    }
    public void execute() {
        if (this.notifier!=null) {
            this.notifier.notifyUser();
            System.out.println("Notifying user...");
        }
    }
}

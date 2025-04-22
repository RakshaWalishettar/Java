package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.NotificationService;
import com.xworkz.Implement.internal.EmailNotifier;
import com.xworkz.Implement.internal.Notifier;

public class NotificationRunner {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        NotificationService service = new NotificationService(notifier);
        service.execute();
    }
}

package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.Alarm;

public class DigitalAlarm implements Alarm {
    public void setAlarm() {
        System.out.println("Alarm set for 6:00 AM.");
    }
    public void snooze() {
        System.out.println("Snoozing for 10 minutes.");
    }
    public void stopAlarm() {
        System.out.println("Alarm stopped.");
    }
    @Override
    public void Ring() {
        System.out.println("Welcome, how  can i help.");
    }
}

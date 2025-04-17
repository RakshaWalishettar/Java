package com.xworkz.Connection.internal;

public interface Alarm {
    void setAlarm();
    void snooze();
    void stopAlarm();
    default void Ring() {
        System.out.println("Welcome, how  can i help.");
    }
}

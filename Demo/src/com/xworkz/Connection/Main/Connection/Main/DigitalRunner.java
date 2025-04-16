package com.xworkz.Connection.Main.Connection.Main;

import com.xworkz.Connection.external.DigitalAlarm;
import com.xworkz.Connection.internal.Alarm;

public class DigitalRunner {
    public static void main(String[] args) {
        Alarm alarm = new DigitalAlarm();
        alarm.setAlarm();
        alarm.snooze();
        alarm.stopAlarm();
    }
}

package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Clock;
import com.xworks.Inheritance.external.DigitalClock;
import com.xworks.Inheritance.external.Hang;

public class DCRunner {
    public static void main(String[] args) {
        DigitalClock digitalClock = new DigitalClock();
        digitalClock.stopAlarm();
        digitalClock.showTime();
        digitalClock.tick();
        digitalClock.display();
        digitalClock.setAlarm();

        System.out.println("==================");
        Clock clock1 = new Clock();
        clock1.display();
        clock1.setAlarm();
        clock1.tick();
        clock1.showTime();
        clock1.stopAlarm();

        System.out.println("==================");
        Hang hang=new Hang();
        hang.battery(clock1);
        hang.battery(hang);
    }
}

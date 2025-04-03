package com.xworks.Inheritance.external;

public class DigitalClock extends Clock{
    public void digitalClock() {
        System.out.println("No-args constructor: DigitalClock");
    }

    {
        super.showTime();
        System.out.println("DigitalClock displays digital time...");
    }

    {
        super.tick();
        System.out.println("DigitalClock operates silently...");
    }

    {
        super.setAlarm();
        System.out.println("DigitalClock alarm is set with a tune...");
    }

    {
        super.display();
        System.out.println("DigitalClock has an LED display...");
    }

    {
        super.stopAlarm();
        System.out.println("DigitalClock alarm turned off...");
    }
}

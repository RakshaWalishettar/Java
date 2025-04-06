package com.xworks.Inheritance.external;

public class DigitalClock extends Clock{
    public void digitalClock() {
        System.out.println("No-args constructor: DigitalClock");
    }
    @Override
    public void showTime(){
        System.out.println("DigitalClock displays digital time...");
    }
    @Override
    public void tick(){
        System.out.println("DigitalClock operates silently...");
    }
    @Override
    public void setAlarm(){
        System.out.println("DigitalClock alarm is set with a tune...");
    }
    @Override
    public void display(){
        System.out.println("DigitalClock has an LED display...");
    }
    @Override
    public void stopAlarm(){
        System.out.println("DigitalClock alarm turned off...");
    }
}

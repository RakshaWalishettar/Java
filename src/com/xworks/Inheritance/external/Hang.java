package com.xworks.Inheritance.external;

public class Hang extends Clock{
    public void wall(){
        System.out.println("the clock is hanged to wall");
    }
    public void battery(Clock clock){
        clock.stopAlarm();
        clock.tick();
        clock.setAlarm();
        clock.showTime();
        clock.display();

        if(clock instanceof Hang){
            Hang hang=new Hang();
            System.out.println("the instance of the Hang is clock");
            hang.wall();
        }
    }


}

package com.xworkz.inheritance.external;

public class GermanShepherd extends Dogs {
    public void GS() {
        System.out.println("the no-agr conts og GS");
        {

            super.breathing();
            System.out.println("German Shepherd is breathing strongly");
        }
        {
            super.eating();
            System.out.println("German Shepherd is eating vigorously");
        }
        {
            super.sleeping();
            System.out.println("German Shepherd is sleeping calmly");
        }
        {
            super.barking();
            System.out.println("German Shepherd is barking loudly");
        }
        {
            super.wagging();
            System.out.println("German Shepherd is wagging its tail happily");
        }
    }
}

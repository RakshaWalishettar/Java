package com.xworks.Inheritance.external;

public class GermanShepherd extends Dogs {
    public GermanShepherd() {
        System.out.println("the no-agr conts og GS");
    }
    @Override
    public void breathing() {
        System.out.println("German Shepherd is breathing strongly");
    }
    @Override
    public void eating() {
        System.out.println("German Shepherd is eating vigorously");
    }
    @Override
    public void sleeping() {
        System.out.println("German Shepherd is sleeping calmly");
    }
    @Override
    public void barking() {
        System.out.println("German Shepherd is barking loudly");
    }
    @Override
    public void wagging() {
        System.out.println("German Shepherd is wagging its tail happily");
    }
    public void type()
    {
        System.out.println("running type of the dog");
    }
}

package com.xworks.Inheritance.external;

public class Snake extends Reptile {
    public void snake() {
        System.out.println("no-args const Snake");
    }

    @Override
    public void regulate_temperature(){
        System.out.println("Snake is regulate_temperature ...");
    }

    @Override
    public void move(){
        System.out.println("Snake is move...");
    }

    @Override
    public void eat(){
        System.out.println("Snake is eat..");
    }

    @Override
    public void sleep(){
        System.out.println("Snake is sleep.");
    }

    @Override
    public void shed_skin(){
        System.out.println("Snake shed_skin.");
    }
}

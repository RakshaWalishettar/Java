package com.xworks.Inheritance.external;

public class Knight extends Warrior{
    public Knight() {
        System.out.println("no args const of knight");
    }

    @Override
    public void fighting(){
        System.out.println("Knight is fighting with honor");
    }

    @Override
    public void defending(){
        System.out.println("Knight is defending the kingdom");
    }

    @Override
    public void riding(){
        System.out.println("Knight is riding a horse");
    }

    @Override
    public void training(){
        System.out.println("Knight is training for battle");
    }

    @Override
    public void strategizing(){
        System.out.println("Knight is planning warfare strategies");
    }

}

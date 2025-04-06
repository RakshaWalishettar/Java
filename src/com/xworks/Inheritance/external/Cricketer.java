package com.xworks.Inheritance.external;

public class Cricketer extends Player {
    public Cricketer(){
        System.out.println("no arg const of Cricketer");
    }@Override
    public void play(){
        System.out.println("Cricketer is playing a cricket match.");
    }
    @Override
    public void train(){
        System.out.println("Cricketer is practicing batting and bowling.");
    }
    @Override
    public void rest(){
        System.out.println("Cricketer is taking rest after a match.");
    }
    @Override
    public void compete(){
        System.out.println("Cricketer is competing in a tournament.");
    }
    @Override
    public void followRules(){
        System.out.println("Cricketer follows the cricket rulebook.");
    }

}

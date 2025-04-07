package com.xworks.Inheritance.external;

public class Goalkeeper extends Footballer{
    public Goalkeeper(){
        System.out.println("no arg const of Goalkeeper");
    }@Override
    public void train(){
        System.out.println("Goalkeeper is blocking the goal!");
    }
    @Override
    public void running(){
        System.out.println("Goalkeeper dives to save the shot!");
    }
    @Override
    public void pass(){
        System.out.println("Goalkeeper distributes the ball to teammates");
    }@Override
    public void shoot(){
        System.out.println("Goalkeeper commands the defensive line");
    }
    @Override
    public void rest(){
        System.out.println("Goalkeeper catches the incoming ball");
    }
    public void boots(){
        System.out.println("the runner is the boots");
    }
}

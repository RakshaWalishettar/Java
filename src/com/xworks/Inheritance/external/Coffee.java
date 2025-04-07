package com.xworks.Inheritance.external;

public class Coffee extends Drink{
    public Coffee() {
        System.out.println("No-args constructor for Coffee");
    }
    @Override
    public void brew(){
        System.out.println("Brewing coffee...");
    }
    @Override
    public void pour(){
        System.out.println("Pouring coffee...");
    }
    @Override
    public void addMilk(){
        System.out.println("Adding milk to coffee...");
    }
    @Override
    public void sweeten(){
        System.out.println("Sweetening coffee...");
    }
    @Override
    public void drink(){
        System.out.println("Drinking coffee...");
    }
    public void hot(){
        System.out.println("hot coffee");
    }
}

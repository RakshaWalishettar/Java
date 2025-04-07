package com.xworks.Inheritance.external;

public class Hammer extends Tool{
    public Hammer() {
        System.out.println("Hammer created.");
    }

    @Override
    public void use(){
        System.out.println("Hammer is striking.");
    }

    @Override
    public void carry(){
        System.out.println("Hammer is lifted.");
    }

    @Override
    public void store(){
        System.out.println("Hammer is dropped.");
    }

    @Override
    public void repair(){
        System.out.println("Hammer is being repaired.");
    }
    public void beat(){
        System.out.println("the runner cut");
    }
}

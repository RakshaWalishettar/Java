package com.xworks.Inheritance.external;

public class Plaer extends Cricket{
    public Plaer() {
        System.out.println("Batsman no-arg constructor");
    }
    @Override
    public void play(){
        System.out.println("Batsman plays cricket...");
    }
    @Override
    public void batting(){
        System.out.println("Batsman specializes in batting...");
    }
    @Override
    public void fielding(){
        System.out.println("Batsman is fielding...");
    }
    @Override
    public void practice(){
        System.out.println("Batsman practices hard...");
    }
    @Override
    public void rest(){
        System.out.println("Batsman takes rest after training...");
    }
}

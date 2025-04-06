package com.xworks.Inheritance.external;

public class Parrot extends Bird{
    public Parrot() {
        System.out.println("No-args constructor of Parrot");
    }@Override
    public void breathing(){
        System.out.println("Parrot is breathing");
    }@Override
    public void eating(){
        System.out.println("Parrot is eating");
    }@Override
    public void sleeping(){
        System.out.println("Parrot is sleeping");
    }@Override
    public void flying(){
        System.out.println("Parrot is flying");
    }@Override
    public void chirping(){
        System.out.println("Parrot is chirping");
    }

}

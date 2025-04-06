package com.xworks.Inheritance.external;

public class Diwali extends Festival{
    public void diwali() {
        System.out.println("no-args constructor Diwali");
    }
    @Override
    public void lightLamps(){
        System.out.println("Diwali: Lighting diyas");
    }
    @Override
    public void burstCrackers(){
        System.out.println("Diwali: Enjoying fireworks");
    }
    @Override
    public void pray(){
        System.out.println("Diwali: Performing Lakshmi Puja");
    }
    @Override
    public void distributeSweets(){
        System.out.println("Diwali: Sharing sweets with loved ones");
    }
    @Override
    public void visitRelatives(){
        System.out.println("Diwali: Meeting family and friends");
    }
}

package com.xworks.Inheritance.external;

public class Type extends Shoes{
    public Type() {
        System.out.println("Type of shoes is specified.");
    }

    @Override
    public void wear(){
        System.out.println("Type is being worn...");
    }

    @Override
    public void cleaning(){
        System.out.println("Type is being cleaned...");
    }

    @Override
    public void polish(){
        System.out.println("Type is being polished...");
    }

    @Override
    public void tieLaces(){
        System.out.println("Type laces are being tied...");
    }

    @Override
    public void remove(){
        System.out.println("Type is being removed...");
    }

}

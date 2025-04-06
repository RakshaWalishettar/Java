package com.xworks.Inheritance.external;

public class Sharp extends Sword{
    public Sharp() {
        System.out.println("Sharp sword created.");
    }

    @Override
    public void swing(){
        System.out.println("Sharp sword swings faster...");
    }

    @Override
    public void stab(){
        System.out.println("Sharp sword stabs deeply...");
    }

    @Override
    public void block(){
        System.out.println("Sharp sword blocks effectively...");
    }

    @Override
    public void sharpen(){
        System.out.println("Sharp sword remains razor-sharp...");
    }

    @Override
    public void attack(){
        System.out.println("Sharp sword delivers a powerful attack...");
    }
}

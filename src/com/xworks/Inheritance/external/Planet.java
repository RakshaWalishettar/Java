package com.xworks.Inheritance.external;

public class Planet extends SpaceObject{
    @Override
    public void rotate(){
        System.out.println("Planet is rotating on its axis");
    }
    @Override
    public void revolve(){
        System.out.println("Planet is revolving around the Sun");
    }

    @Override
    public void haveGravity(){

        System.out.println("Planet has gravitational force");
    }

    @Override
    public void supportLife(){
        System.out.println("Planet may or may not support life, depending on conditions");
    }

    @Override
    public void orbitSun(){
        System.out.println("Planet follows an orbit around the Sun");
    }
}

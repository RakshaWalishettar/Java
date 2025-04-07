package com.xworks.Inheritance.external;

public class Gun extends Weapon{
    public Gun() {
        System.out.println("Gun instance created");
    }
    @Override
    public void load(){
        System.out.println("Gun is loading...");
    }
    @Override
    public void shoot(){
        System.out.println("Gun is shooting...");
    }
    @Override
    public  void reload(){
        System.out.println("Gun is reloading...");
    }
    @Override
    public void aim(){
        System.out.println("Gun is aiming...");
    }
    @Override
    public void safetyLock(){
        System.out.println("Gun safety lock engaged...");
    }
    public void bullet(){
        System.out.println("the runner bullet");
    }
}

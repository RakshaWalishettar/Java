package com.xworks.Inheritance.external;

public class Icecream extends Cold{
    public Icecream() {
        System.out.println("IceCream instance created.");
    }
    @Override
    public void freeze(){
        System.out.println("IceCream is frozen.");
    }
    @Override
    public void scoop(){
        System.out.println("IceCream is scooped.");
    }
    @Override
    public void melt(){
        System.out.println("IceCream is melting.");
    }
    @Override
    public void flavorMix(){
        System.out.println("IceCream is mixing flavors.");
    }
    @Override
    public void eat(){
        System.out.println("IceCream is being eaten.");
    }
}

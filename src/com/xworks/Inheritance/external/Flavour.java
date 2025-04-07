package com.xworks.Inheritance.external;

public class Flavour extends Snacks{
    public void chilly() {
        System.out.println("the chips has chilly flavour");
    }
    public void masala(Snacks snacks){
        snacks.openPacket();
        snacks.flavor();
        snacks.crunch();
        snacks.share();
        snacks.finish();

        if(snacks instanceof Flavour){
            Flavour flavour=(Flavour) snacks;
            System.out.println("flavour instance of snacks");
            flavour.chilly();
        }
    }
}

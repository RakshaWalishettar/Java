package com.xworks.Inheritance.external;

public class Deepa extends Festival{
    public void food(){
        System.out.println("the food is prepared");
    }
    public void dress(Festival festival){
        festival.burstCrackers();
        festival.pray();
        festival.lightLamps();
        festival.distributeSweets();
        festival.visitRelatives();

        if(festival instanceof Deepa){
            Deepa deepa=(Deepa) festival;
            System.out.println("the instance of the deepa is festival");
            deepa.food();
        }
    }

}

package com.xworks.Inheritance.external;

public class Playstation extends Laptop{
    public void videogame(){
        System.out.println("the playstation has the videogame");
    }
    public void device(Laptop laptop){
        laptop.On();
        laptop.type();
        laptop.display();
        laptop.specs();

        if (laptop instanceof Playstation){
            Playstation playstation=(Playstation) laptop;
            System.out.println("the instance of the playstation is laptop");
            playstation.videogame();
        }
    }
}

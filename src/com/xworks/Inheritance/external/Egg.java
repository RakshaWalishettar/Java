package com.xworks.Inheritance.external;

public class Egg extends Birds{
    public void round() {
        System.out.println("birth gives throw egg");
    }
    public void sound(Birds birds){
        birds.sing();
        birds.fly();
        birds.eat();
        birds.migrate();
        birds.buildNest();

        if(birds instanceof Egg){
            Egg egg=(Egg) birds;
            System.out.println("give birth to young ones");
            egg.round();
        }
    }
}

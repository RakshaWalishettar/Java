package com.xworks.Inheritance.external;

public class HaveEyes extends Mammal{
    public void see() {
        System.out.println("mammals can see around");
    }
    public void run(Mammal mammal){
        mammal.walk();
        mammal.eat();
        mammal.makeSound();
        mammal.sleep();
        mammal.giveBirth();


        if (mammal instanceof HaveEyes ){
            HaveEyes eyes=(HaveEyes) mammal;
            System.out.println("have eyes to see the things ");
            eyes.see();
        }
    }
}

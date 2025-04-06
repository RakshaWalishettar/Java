package com.xworkz.Inheritance.external.Runner;


import com.xworks.Inheritance.external.Animal;
import com.xworks.Inheritance.external.Mammal;

public class AnimalRunner {
    public static void main(String[] args){
        Mammal mammal=new Mammal();
       mammal.sleep();
       mammal.makeSound();
       mammal.eat();
       mammal.walk();
       mammal.giveBirth();

       System.out.println("===========================");
       Animal animal=new Animal();
       animal.eat();
       animal.walk();
       animal.makeSound();
       animal.giveBirth();
       animal.sleep();
    }
}

package com.xworks.Inheritance.external;

public class Breed extends Dogs{
    public void varity(){
        System.out.println("the dog has varity of breed");
    }
    public void type(Dogs dogs){
        dogs.wagging();
        dogs.barking();
        dogs.breathing();
        dogs.eating();
        dogs.sleeping();

        if(dogs instanceof Breed){
            Breed breed=(Breed) dogs;
            System.out.println("the breed instance is dog");
            breed.varity();
        }
    }
}

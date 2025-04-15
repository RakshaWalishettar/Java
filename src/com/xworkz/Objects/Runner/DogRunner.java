package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Apple;
import com.xworkz.Objects.internal.Dog;

public class DogRunner {
    public static void main(String[] args){
        Dog dog=new Dog("pug","rohan",10);
        Dog dog1=new Dog("pug","rohini",5);
        System.out.println(dog);
        System.out.println("the dog has:"+(dog==dog1));
        boolean same=dog.equals(dog1);
        System.out.println("both cycle1 and cycle2 are same :"+same);

        int code = dog.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(dog));
    }
}

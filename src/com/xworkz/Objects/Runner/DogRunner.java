package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Apple;
import com.xworkz.Objects.internal.Dog;

public class DogRunner {
    public static void main(String[] args){
        Dog dog=new Dog("pug","rohan",10);
        System.out.println(dog);

        int code = dog.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(dog));
    }
}

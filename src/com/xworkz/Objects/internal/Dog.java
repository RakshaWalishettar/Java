package com.xworkz.Objects.internal;

public class Dog {
    private String breed;
    private String owner;
    private int age;

    public Dog(String breed, String owner, int age) {
        this.breed = breed;
        this.owner = owner;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Dog)
            {
                System.out.println("ref is beer, will compare...");
                Dog dog1=this;
                Dog dog2=(Dog) obj;//why should i do casting ??
                if(dog1.breed.equals(dog2.breed) && dog1.owner.equals(dog2.owner))
                {
                    System.out.println("both dog are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dog [breed=" + breed + ", owner=" + owner + ", age=" + age + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 32;
    }
}
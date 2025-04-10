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
    public String toString() {
        return "Dog [breed=" + breed + ", owner=" + owner + ", age=" + age + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 32;
    }
}
package com.xworks.Inheritance.external;

public class India extends Country {
    public India() {
        System.out.println("no-args constructor India");
    }
    @Override
    public void nationalAnthem(){
        System.out.println("India's national anthem is 'Jana Gana Mana'.");
    }
    @Override
    public void nationalAnimal(){
        System.out.println("India's national animal is the Tiger.");
    }
    @Override
    public void nationalLanguage(){
        System.out.println("India's widely spoken language is Hindi.");
    }
    @Override
    public void nationalSport(){
        System.out.println("India's national sport is Hockey.");
    }
    @Override
    public void nationalFlag(){
        System.out.println("India's national flag has three colors and the Ashoka Chakra.");
    }
    public void varityoffood(){
        System.out.println("the food varity runner");
    }
}

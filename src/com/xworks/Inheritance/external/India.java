package com.xworks.Inheritance.external;

public class India extends Country {
    public void india() {
        System.out.println("no-args constructor India");
    }

    {
        super.nationalAnthem();
        System.out.println("India's national anthem is 'Jana Gana Mana'.");
    }

    {
        super.nationalAnimal();
        System.out.println("India's national animal is the Tiger.");
    }

    {
        super.nationalLanguage();
        System.out.println("India's widely spoken language is Hindi.");
    }

    {
        super.nationalSport();
        System.out.println("India's national sport is Hockey.");
    }

    {
        super.nationalFlag();
        System.out.println("India's national flag has three colors and the Ashoka Chakra.");
    }
}

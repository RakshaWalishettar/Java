package com.xworks.Inheritance.external;

public class Sorcerer extends Mage{
    public Sorcerer() {
        super();
        System.out.println("No-args constructor of Sorcerer");
    }
    {
        super.breathing();
        System.out.println("Sorcerer breathing with magical energy");
    }
    {
        super.eating();
        System.out.println("Sorcerer eating enchanted food");
    }
    {
        super.sleeping();
        System.out.println("Sorcerer sleeping in a mystical trance");
    }
    {
        super.castingSpells();
        System.out.println("Sorcerer casting powerful spells");
    }
    {
        super.channelingMana();
        System.out.println("Sorcerer channeling mana at a higher level");
    }
}

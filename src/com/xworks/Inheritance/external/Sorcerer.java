package com.xworks.Inheritance.external;

public class Sorcerer extends Mage{
    public Sorcerer() {
        System.out.println("No-args constructor of Sorcerer");
    }
    @Override
    public void breathing(){
        System.out.println("Sorcerer breathing with magical energy");
    }
    @Override
    public void eating(){
        System.out.println("Sorcerer eating enchanted food");
    }
    @Override
    public void sleeping(){
        System.out.println("Sorcerer sleeping in a mystical trance");
    }
    @Override
    public void castingSpells(){
        System.out.println("Sorcerer casting powerful spells");
    }
    @Override
    public void channelingMana(){
        System.out.println("Sorcerer channeling mana at a higher level");
    }
}

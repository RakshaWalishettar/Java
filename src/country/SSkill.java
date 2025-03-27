package com.xworkz.country;

public class SSkill {
    String name;
    Experience experience;

    public SSkill(String name, Experience experience) {
        this.name = name;
        this.experience = experience;
    }

    public void display() {
        System.out.println("          Skill: " + this.name);
        this.experience.display();
    }
}

package com.xworkz.country;

import java.util.Iterator;
import java.util.List;

public class Personnel {
    String name;
    List<SSkill> skills;

    public Personnel(String name, List<SSkill> skills) {
        this.name = name;
        this.skills = skills;
    }

    public void display() {
        System.out.println("        Personnel: " + this.name);
        Iterator var1 = this.skills.iterator();

        while(var1.hasNext()) {
            SSkill skill = (SSkill)var1.next();
            skill.display();
        }

    }
}

package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.WHO;

public class Hospital {
    private WHO who;

    public Hospital(WHO who) {
        System.out.println("the WHO is the main things ");
        this.who = who;
    }

    public void doctor() {
        System.out.println("the hospital executes the WHO");
        if (this.who != null) {
            this.who.safetyStandards();
        } else {
            System.out.println("no safety");
        }
    }
}

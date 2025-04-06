package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Footballer;
import com.xworks.Inheritance.external.Goalkeeper;

public class GoalRunner {
    public static void main(String[] args) {
        Goalkeeper goalkeeper = new Goalkeeper();
        goalkeeper.train();
        goalkeeper.shoot();
        goalkeeper.rest();
        goalkeeper.pass();


        System.out.println("==============================");
        Footballer player1 = new Footballer();
        player1.train();
        player1.shoot();
        player1.rest();
        player1.pass();

    }
}

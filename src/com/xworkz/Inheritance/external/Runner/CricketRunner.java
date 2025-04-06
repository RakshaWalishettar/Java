package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Cricketer;
import com.xworks.Inheritance.external.Player;

public class CricketRunner {
    public static void main(String[] args) {
        Cricketer cricketer = new Cricketer();
        cricketer.train();
        cricketer.compete();
        cricketer.rest();
        cricketer.followRules();
        cricketer.play();

        System.out.println("========================================");
        Player player1 = new Player();
        player1.train();
        player1.rest();
        player1.compete();
        player1.play();
        player1.followRules();
    }
}

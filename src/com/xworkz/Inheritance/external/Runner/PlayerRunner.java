package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Cricketer;
import com.xworks.Inheritance.external.Player;

public class PlayerRunner {
    public static void main(String[] args) {
        Player player=new Player();
        player.train();
        player.compete();
        player.rest();
        player.followRules();
        player.play();

        System.out.println("===========================");
        Cricketer cricketer=new Cricketer();
        cricketer.play();
        cricketer.rest();
        cricketer.followRules();
        cricketer.train();
        cricketer.compete();
    }
}

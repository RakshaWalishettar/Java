package com.xworks.Inheritance.external;

public class Cricketer extends Player {
    {
        super.play();
        System.out.println("Cricketer is playing a cricket match.");
    }

    {
        super.train();
        System.out.println("Cricketer is practicing batting and bowling.");
    }

    {
        super.rest();
        System.out.println("Cricketer is taking rest after a match.");
    }

    {
        super.compete();
        System.out.println("Cricketer is competing in a tournament.");
    }

    {
        super.followRules();
        System.out.println("Cricketer follows the cricket rulebook.");
    }

}

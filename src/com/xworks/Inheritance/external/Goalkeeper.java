package com.xworks.Inheritance.external;

public class Goalkeeper extends Footballer{
    {
        super.train();
        System.out.println("Goalkeeper is blocking the goal!");
    }

    {
        super.run() ;
        System.out.println("Goalkeeper dives to save the shot!");
    }

    {
        super.pass();
        System.out.println("Goalkeeper distributes the ball to teammates");
    }
    {
        super.shoot();
        System.out.println("Goalkeeper commands the defensive line");
    }

    {
        super.rest() ;
        System.out.println("Goalkeeper catches the incoming ball");
    }
}

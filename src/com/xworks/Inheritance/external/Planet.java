package com.xworks.Inheritance.external;

public class Planet extends SpaceObject{
    {
        super.rotate();
        System.out.println("Planet is rotating on its axis");
    }
    {
        super.revolve();
        System.out.println("Planet is revolving around the Sun");
    }

    {
    super.haveGravity();
        System.out.println("Planet has gravitational force");
    }

    {
        super.supportLife();
        System.out.println("Planet may or may not support life, depending on conditions");
    }

    {
        super.orbitSun();
        System.out.println("Planet follows an orbit around the Sun");
    }
}

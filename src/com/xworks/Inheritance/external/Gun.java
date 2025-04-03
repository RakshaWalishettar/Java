package com.xworks.Inheritance.external;

public class Gun extends Weapon{
    public void gun() {
        System.out.println("Gun instance created");
    }

    {
        super.load();
        System.out.println("Gun is loading...");
    }

    {
        super.shoot();
        System.out.println("Gun is shooting...");
    }

    {
        super.reload();
        System.out.println("Gun is reloading...");
    }

    {
        super.aim();
        System.out.println("Gun is aiming...");
    }

    {
        super.safetyLock();
        System.out.println("Gun safety lock engaged...");
    }
}

package com.xworks.Inheritance.external;

public class Sharp extends Sword{
    public Sharp() {
        System.out.println("Sharp sword created.");
    }

    {
        super.swing();
        System.out.println("Sharp sword swings faster...");
    }

    {
        super.stab();
        System.out.println("Sharp sword stabs deeply...");
    }

    {
        super.block();
        System.out.println("Sharp sword blocks effectively...");
    }

    {
        super.sharpen();
        System.out.println("Sharp sword remains razor-sharp...");
    }

    {
        super.attack();
        System.out.println("Sharp sword delivers a powerful attack...");
    }
}

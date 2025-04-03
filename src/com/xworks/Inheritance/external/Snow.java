package com.xworks.Inheritance.external;

public class Snow extends Christmas{
    public Snow() {
        System.out.println("Snow: No-args constructor.");
    }

    {
        super.decorateTree();
        System.out.println("Snow: Adding snow-themed decorations.");
    }

    {
        super.exchangeGifts();
        System.out.println("Snow: Exchanging gifts with a snowy theme.");
    }

    {
        super.singCarols();
        System.out.println("Snow: Singing carols in the snow.");
    }

    {
        super.cookDinner();
        System.out.println("Snow: Preparing a warm meal in the cold.");
    }

    {
        super.celebrate();
        System.out.println("Snow: Celebrating with snow activities.");
    }
}

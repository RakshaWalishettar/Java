package com.xworks.Inheritance.external;

public class Snow extends Christmas{
    public Snow() {
        System.out.println("Snow: No-args constructor.");
    }
    @Override
    public void decorateTree(){
        System.out.println("Snow: Adding snow-themed decorations.");
    }

    @Override
    public void exchangeGifts(){
        System.out.println("Snow: Exchanging gifts with a snowy theme.");
    }

    @Override
    public void singCarols(){
        System.out.println("Snow: Singing carols in the snow.");
    }

    @Override
    public void cookDinner(){
        System.out.println("Snow: Preparing a warm meal in the cold.");
    }

    @Override
    public void celebrate(){
        System.out.println("Snow: Celebrating with snow activities.");
    }
}

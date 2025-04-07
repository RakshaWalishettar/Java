package com.xworks.Inheritance.external;

import jdk.nashorn.internal.objects.annotations.Constructor;

public class Chess extends BoardGame{
    public Chess() {
        System.out.println("No-args constructor: Chess");
    }
    @Override
    public void setupBoard(){
        System.out.println("Chess: Setting up chess pieces...");
    }
    @Override
    public void startGame(){
        System.out.println("Chess: White makes the first move...");
    }
    @Override
    public void makeMove(){
        System.out.println("Chess: Moving a piece...");
    }
    @Override
    public void checkWinCondition(){
        System.out.println("Chess: Checking for checkmate or stalemate...");
    }
    @Override
    public  void endGame(){
        System.out.println("Chess: Game over...");
    }
    public void coins(){
        System.out.println("runner coins of chess");
    }
}

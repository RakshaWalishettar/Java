package com.xworks.Inheritance.external;

public class Chess extends BoardGame{
    public Chess() {
        System.out.println("No-args constructor: Chess");
    }

    {
        super.setupBoard();
        System.out.println("Chess: Setting up chess pieces...");
    }

    {
        super.startGame();
        System.out.println("Chess: White makes the first move...");
    }

    {
        super.makeMove();
        System.out.println("Chess: Moving a piece...");
    }

    {
        super.checkWinCondition();
        System.out.println("Chess: Checking for checkmate or stalemate...");
    }

    {
        super.endGame();
        System.out.println("Chess: Game over...");
    }
}

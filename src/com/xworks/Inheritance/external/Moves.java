package com.xworks.Inheritance.external;

public class Moves extends  Chess{
    public void smartness(){
        System.out.println("the chess need smartness");
    }
    public void coins(Chess chess){
        chess.checkWinCondition();
        chess.startGame();
        chess.endGame();
        chess.setupBoard();
        chess.makeMove();

        if(chess instanceof Moves){
            Moves moves=(Moves) chess;
            System.out.println("the moves is the instance of the boardgames");
        }
    }
}

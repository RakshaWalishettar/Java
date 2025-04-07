package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.BoardGame;
import com.xworks.Inheritance.external.Chess;
import com.xworks.Inheritance.external.Map;
import com.xworks.Inheritance.external.Moves;

public class ChessRunner {
    public static void main(String[] args) {
        Chess chess = new Chess();
        chess.checkWinCondition();
        chess.endGame();
        chess.makeMove();
        chess.setupBoard();
        chess.startGame();

        System.out.println("==================================");

        BoardGame game2 = new BoardGame();
        game2.checkWinCondition();
        game2.endGame();
        game2.startGame();
        game2.makeMove();
        game2.setupBoard();

        System.out.println("==================================");

        Moves moves=new Moves();
        moves.coins(moves);
        moves.coins(chess);
    }
}

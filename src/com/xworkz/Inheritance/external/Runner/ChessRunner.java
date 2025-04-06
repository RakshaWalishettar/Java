package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.BoardGame;
import com.xworks.Inheritance.external.Chess;

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
    }
}

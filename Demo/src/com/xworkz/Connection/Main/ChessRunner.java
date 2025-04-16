package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.ChessGame;
import com.xworkz.Connection.internal.Game;

public class ChessRunner {
    public static void main(String[] args) {
        Game game = new ChessGame();
        game.start();
        game.play();
        game.end();
    }
}

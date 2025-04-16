package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.Game;

public class ChessGame implements Game {
    public void start() {
        System.out.println("Chess game started.");
    }
    public void play() {
        System.out.println("Playing chess...");
    }
    public void end() {
        System.out.println("Chess game ended.");
    }
}

package com.xworkz.Connection.internal;

public interface Game {
    void start();
    void play();
    void end();
    default void greatPlayer() {
        System.out.println("Welcome, Player.");
    }
}

package com.xworkz.Connection.internal;

public interface GameConsole {
    void powerOn();
    void playGame();
    void powerOff();
    default void online() {
        System.out.println("Welcome!");
    }
}

package com.xworkz.Connection.internal;
public interface MediaPlayer {
    void play();
    void pause();
    void stop();
    default void viedo() {
        System.out.println("Welcome!");
    }
}

package com.xworkz.Connection.internal;

public interface PodcastApp {
    void playEpisode();
    void pauseEpisode();
    void downloadEpisode();
    default void music() {
        System.out.println("Welcome!");
    }
}

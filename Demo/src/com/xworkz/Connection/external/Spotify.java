package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.PodcastApp;

public class Spotify implements PodcastApp {
    public void playEpisode() {
        System.out.println("Playing podcast episode...");
    }
    public void pauseEpisode() {
        System.out.println("Podcast paused.");
    }
    public void downloadEpisode() {
        System.out.println("Episode downloaded for offline listening.");
    }
}

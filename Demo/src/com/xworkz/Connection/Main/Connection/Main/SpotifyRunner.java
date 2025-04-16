package com.xworkz.Connection.Main.Connection.Main;

import com.xworkz.Connection.external.Spotify;
import com.xworkz.Connection.internal.PodcastApp;

public class SpotifyRunner {
    public static void main(String[] args) {
        PodcastApp app = new Spotify();
        app.playEpisode();
        app.pauseEpisode();
        app.downloadEpisode();
    }
}

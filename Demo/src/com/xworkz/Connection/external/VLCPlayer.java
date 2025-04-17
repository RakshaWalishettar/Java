package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.MediaPlayer;

public class VLCPlayer implements MediaPlayer {
    public void play() {
        System.out.println("Media is playing.");
    }
    public void pause() {
        System.out.println("Media is paused.");
    }
    public void stop() {
        System.out.println("Media playback stopped.");
    }
    @Override
    public void viedo() {
        System.out.println("Welcome!");
    }

}

package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.VLCPlayer;
import com.xworkz.Connection.internal.MediaPlayer;

public class VLCRunner {
    public static void main(String[] args) {
        MediaPlayer player = new VLCPlayer();
        player.play();
        player.pause();
        player.stop();
        player.viedo();
    }
}

package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Player;

public class MediaService {
    private Player player;
    public MediaService(Player player) {
        this.player = player;
        System.out.println("MediaService initialized");
    }
    public void execute() {
        System.out.println("Starting media playback...");
        if (this.player != null) {
            this.player.play();
        } else {
            System.out.println("not started");
        }
    }
}

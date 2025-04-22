package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.MediaService;
import com.xworkz.Implement.internal.AudioPlayer;
import com.xworkz.Implement.internal.Player;

public class PlayerRunner {
    public static void main(String[] args) {
        Player player = new AudioPlayer();
        MediaService service = new MediaService(player);
        service.execute();
    }
}

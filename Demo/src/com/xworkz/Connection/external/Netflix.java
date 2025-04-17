package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.StreamingService;

public class Netflix implements StreamingService {
    public void playContent() {
        System.out.println("Playing movie on Netflix.");
    }

    public void pauseContent() {
        System.out.println("Pausing content on Netflix.");
    }

    public void stopContent() {
        System.out.println("Stopping Netflix playback.");
    }
    @Override
    public void online() {
        System.out.println("Welcome!");
    }
}

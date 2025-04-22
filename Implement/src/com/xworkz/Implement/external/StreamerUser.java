package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Scanner;
import com.xworkz.Implement.internal.Streamer;

public class StreamerUser {
    private Streamer streamer;
    public StreamerUser(Streamer streamer) {
        this.streamer = streamer;
        System.out.println("StreamerUser ready");
    }
    public void execute() {
        System.out.println("Start streaming...");
        if (this.streamer != null) {
            this.streamer.stream();
        } else {
            System.out.println("not streaming");
        }
    }
}

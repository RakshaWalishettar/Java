package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.StreamerUser;
import com.xworkz.Implement.internal.MusicStreamer;
import com.xworkz.Implement.internal.Streamer;

public class StreamerRunner {
    public static void main(String[] args) {
        Streamer streamer = new MusicStreamer();
        StreamerUser user = new StreamerUser(streamer);
        user.execute();
    }
}

package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.Netflix;
import com.xworkz.Connection.internal.StreamingService;

public class NetflixRunner {
    public static void main(String[] args) {
        StreamingService service = new Netflix();
        service.playContent();
        service.pauseContent();
        service.stopContent();
        service.online();
    }
}

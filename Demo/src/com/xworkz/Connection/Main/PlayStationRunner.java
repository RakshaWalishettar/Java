package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.PlayStation;
import com.xworkz.Connection.internal.GameConsole;

public class PlayStationRunner {
    public static void main(String[] args) {
        GameConsole console = new PlayStation();
        console.powerOn();
        console.playGame();
        console.powerOff();
    }
}

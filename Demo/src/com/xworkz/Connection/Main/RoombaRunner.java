package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.Roomba;
import com.xworkz.Connection.internal.CleaningRobot;

public class RoombaRunner {
    public static void main(String[] args) {
        CleaningRobot robo = new Roomba();
        robo.startCleaning();
        robo.returnToDock();
        robo.emptyDustbin();
    }
}

package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.CleaningRobot;

public class Roomba implements CleaningRobot {
        public void startCleaning() {
            System.out.println("Roomba started cleaning.");
        }

        public void returnToDock() {
            System.out.println("Roomba returning to dock.");
        }

        public void emptyDustbin() {
            System.out.println("Roomba's dustbin emptied.");
        }
        @Override
        public void machine() {
            System.out.println("Welcome!");
        }
}

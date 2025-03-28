package Jjava.Main;
import Jjava.external.*;
import Jjava.external.Alien;
import Jjava.external.Camera;
import Jjava.external.Jail;

import java.external.constant.CameraType;
import java.util.Date;
import java.external.constant.SatelliteType;


public class Main {
    public static  void main(String[] args) {
        Jail jail = new Jail("Alcatraz", "USA", "John Doe", 100);
        Satellite satellite = new Satellite(SatelliteType.COMMUNICATION, 500000, 2000, 500);


        IdCard idCard = new IdCard("Plastic", new String[]{"Red", "Blue"}, 0.02, "Designer X");
        Alien alien = new Alien("Astronaut", new Date(), "Tall and glowing");
        Camera camera = new Camera("Canon", 1200, CameraType.DSLR, "WiFi");

        Jail[] jails = {new Jail("Prison1", "Canada", "Mike Ross", 50)};


        Satellite[] satellites = {new Satellite(SatelliteType.NAVIGATION, 700000, 2500, 600)};
        IdCard[] idCards = {new IdCard("Metal", new String[]{"Silver", "Gold"}, 0.05, "Designer Y")};
        Alien[] aliens = {new Alien("Pilot", new Date(), "Short and green")};
        Camera[] cameras = {new Camera("Sony", 1500, CameraType.MIRRORLESS, "Bluetooth")};

            // Print details
        printJailDetails(jail);
        for (Jail j : jails) {
            printJailDetails(j);
        }
    }

    public static void printJailDetails(Jail jail) {
        System.out.println("Jail Name: " + jail.getName());
        System.out.println("Location: " + jail.getLocation());
        System.out.println("Jailer: " + jail.getJailerName());
        System.out.println("Total Cells: " + jail.getTotalCells());
    }
}

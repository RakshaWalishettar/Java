package com.xworkz.Multilevelinheritance.internal;

public class Device {
    public void powerOn() {
        System.out.println("Device is powered on");
    }
}

class Laptop extends Device {
    void bootOS() {
        System.out.println("Laptop is booting operating system");
    }
}

class GamingLaptop extends Laptop {
     public void launchGame() {
        System.out.println("Launching a high-performance game");
    }
    public static void main(String[] args) {
        GamingLaptop gl = new GamingLaptop();
        gl.powerOn();
        gl.bootOS();
        gl.launchGame();
    }

}

package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.SmartMirror;

public class HiMirror implements SmartMirror {
    public void showTime() {
        System.out.println("Time displayed on HiMirror.");
    }

    public void displayNews() {
        System.out.println("News headlines on HiMirror.");
    }

    public void displayWeather() {
        System.out.println("Weather displayed on HiMirror.");
    }
    @Override
    public void sensitative() {
        System.out.println("Welcome!");
    }

}

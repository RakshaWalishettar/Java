package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.CitySignal;
import com.xworkz.Connection.internal.TrafficSignal;

public class CitySignalRunner {
    public static void main(String[] args) {
        TrafficSignal signal = new CitySignal();
        signal.showRed();
        signal.showYellow();
        signal.showGreen();
        signal.rUles();
    }
}

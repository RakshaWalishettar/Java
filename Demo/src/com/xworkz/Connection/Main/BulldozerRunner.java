package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.Bulldozer;
import com.xworkz.Connection.internal.ConstructionMachine;

public class BulldozerRunner {
    public static void main(String[] args) {
        ConstructionMachine cm = new Bulldozer();
        cm.start();
        cm.operate();
        cm.shutdown();
        cm.greetOperator();
    }
}

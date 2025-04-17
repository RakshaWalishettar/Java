package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.IDE;

public class IntelliJ implements IDE {
    public void writeCode() {
        System.out.println("Writing code in IntelliJ.");
    }

    public void debug() {
        System.out.println("Debugging in IntelliJ.");
    }

    public void buildProject() {
        System.out.println("Project built in IntelliJ.");
    }
    @Override
    public void software() {
        System.out.println("Welcome!");
    }
}

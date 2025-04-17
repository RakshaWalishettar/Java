package com.xworkz.Connection.internal;

public interface Browser {
    void openTab();
    void browse();
    void closeTab();
    default void information() {
        System.out.println("Welcome, wt can i help.");
    }

}

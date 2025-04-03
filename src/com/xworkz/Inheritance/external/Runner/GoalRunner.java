package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Footballer;
import com.xworks.Inheritance.external.Goalkeeper;

public class GoalRunner {
    public static void main(String[] args) {
        Footballer player1 = new Goalkeeper(); // Upcasting
        Footballer player2 = new Footballer();
    }
}

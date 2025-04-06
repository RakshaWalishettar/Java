package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Stand;
import com.xworks.Inheritance.external.Table;

public class StandRunner {
    public static void main(String[] args) {
        Stand stand = new Stand();
        stand.supportObjects();
        stand.expand();
        stand.decorate();
        stand.adjustHeight();
        stand.fold();

        System.out.println("=============================");
        Table table = new Table();
        table.supportObjects();
        table.expand();
        table.decorate();
        table.adjustHeight();
        table.fold();
    }
}

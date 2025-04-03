package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Stand;
import com.xworks.Inheritance.external.Table;

public class StandRunner {
    public static void main(String[] args) {
        Table table = new Stand();  // Upcasting: Stand "is a" Table
        Table table1 = new Table();
    }
}

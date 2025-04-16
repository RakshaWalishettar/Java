package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.Hammer;
import com.xworkz.Connection.internal.Tool;

public class HammerRunner {
    public static void main(String[] args) {
        Tool tool = new Hammer();
        tool.pickUp();
        tool.use();
        tool.putDown();
    }
}

package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Hammer;
import com.xworks.Inheritance.external.Nail;
import com.xworks.Inheritance.external.Tool;

public class HammerRunner {
    public static void main(String[] args) {
        Tool tool = new Tool();
        tool.store();
        tool.repair();
        tool.maintain();
        tool.use();
        tool.carry();

        System.out.println("=======================");
        Hammer hammer = new Hammer();
        hammer.store();
        hammer.maintain();
        hammer.repair();
        hammer.use();
        hammer.carry();

        System.out.println("===========================");
        Nail nail=new Nail();
        nail.beat(tool);
        nail.beat(nail);
    }
}

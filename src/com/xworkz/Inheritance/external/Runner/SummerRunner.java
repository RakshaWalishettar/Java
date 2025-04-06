package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Hot;
import com.xworks.Inheritance.external.Summer;

public class SummerRunner {
    public static void main(String[] args) {
        Summer summer = new Summer();
        summer.temperatureRise();
        summer.sweating();
        summer.heatwaves();
        summer.sunBurn();
        summer.dehydration();

        System.out.println("====================================");
        Hot hot = new Hot();
        hot.temperatureRise();
        hot.sweating();
        hot.heatwaves();
        hot.dehydration();
        hot.sunBurn();
    }
}

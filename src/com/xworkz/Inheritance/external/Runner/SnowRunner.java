package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Christmas;
import com.xworks.Inheritance.external.Snow;

public class SnowRunner {
    public static void main(String[] args){
        Christmas christmas=new Christmas();
        christmas.singCarols();
        christmas.exchangeGifts();
        christmas.decorateTree();
        christmas.cookDinner();
        christmas.celebrate();

        System.out.println("================================");
        Snow snow=new Snow();
        snow.singCarols();
        snow.exchangeGifts();
        snow.decorateTree();
        snow.cookDinner();
        snow.celebrate();
    }
}

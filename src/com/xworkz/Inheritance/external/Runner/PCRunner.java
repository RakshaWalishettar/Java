package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Cats;
import com.xworks.Inheritance.external.PersianCat;

public class PCRunner {
    public static void main (String[] args){
        Cats cat=new Cats();
        cat.sleeping();
        cat.purring();
        cat.eating();
        cat.breathing();
        cat.meowing();

        System.out.println("=================================");
        PersianCat persianCat=new PersianCat();
        persianCat.sleeping();
        persianCat.purring();
        persianCat.meowing();
        persianCat.eating();
        persianCat.breathing();
    }
}

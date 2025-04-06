package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Chair;
import com.xworks.Inheritance.external.Furniture;

public class ChairRunner {
    public static void main(String[] args) {
        Furniture furniture1 = new Furniture();
        furniture1.supportWeight();
        furniture1.rotate();
        furniture1.move();
        furniture1.adjustHeight();
        furniture1.fold();

        System.out.println("====================");
        Chair chair=new Chair();
        chair.adjustHeight();
        chair.fold();
        chair.move();
        chair.rotate();
        chair.supportWeight();
    }

}

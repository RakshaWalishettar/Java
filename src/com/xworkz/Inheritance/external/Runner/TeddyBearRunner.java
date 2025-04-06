package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.TeddyBear;
import com.xworks.Inheritance.external.Toy;

public class TeddyBearRunner {
public static void main(String[] args){
    Toy toy=new Toy();
    toy.squeeze();
    toy.decorateRoom();
    toy.sitUpright();
    toy.wash();
    toy.hug();

    System.out.println("==============================");
    TeddyBear teddyBear=new TeddyBear();
    teddyBear.sitUpright();
    teddyBear.squeeze();
    teddyBear.squeeze();
    teddyBear.hug();
    teddyBear.wash();
}
}

package com.xworks.Inheritance.external;

public class Tail extends Felidae{
    public void moves(Felidae felidae){
        System.out.println("moves tail when happy");

        if(felidae instanceof Tail){
            Tail tail=(Tail) felidae;
            System.out.println("cat has tail");
        }
    }
}

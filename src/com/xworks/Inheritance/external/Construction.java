package com.xworks.Inheritance.external;

import java.security.Key;

public class Construction extends House{
    public void Kitchen(House house){
        System.out.println("the kitchen is in house");

        if(house instanceof Construction){
            Construction construction=(Construction) house;
            System.out.println("structure of kitchen");
        }
    }
}

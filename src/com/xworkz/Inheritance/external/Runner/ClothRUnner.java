package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Clothing;
import com.xworks.Inheritance.external.TShirt;

public class ClothRUnner {
    public static void main(String[] args){
        Clothing cloth=new Clothing();
        cloth.identity();
        cloth.protecting();
        cloth.covering();
        cloth.comfort();
        cloth.comfort();

        System.out.println("===================================");
        TShirt tShirt=new TShirt();
        tShirt.clothing();
        tShirt.comfort();
        tShirt.fashion();
        tShirt.covering();
        tShirt.protecting();
        tShirt.identity();
    }
}

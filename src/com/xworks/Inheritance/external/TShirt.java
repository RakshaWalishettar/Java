package com.xworks.Inheritance.external;

public class TShirt extends Clothing{
    public TShirt() {
        super.clothing();
        System.out.println("no-args constructor of TShirt");
    }
    {
        super.covering();
        System.out.println("TShirt covers the upper body");
    }
    {
        super.protecting();
        System.out.println("TShirt protects from sunlight");
    }
    {
        super.fashion();
        System.out.println("TShirt is a trendy fashion choice");
    }
    {
        super.comfort();
        System.out.println("TShirt provides comfort in summer");
    }
    {
        super.identity();
        System.out.println("TShirt represents casual style");
    }
}

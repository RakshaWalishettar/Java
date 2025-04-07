package com.xworks.Inheritance.external;

public class Print extends Clothing{
    public void design() {
        System.out.println("the design is printed");
    }
    public void fold(Clothing clothing){
        clothing.comfort();
        clothing.covering();
        clothing.protecting();
        clothing.identity();
        clothing.protecting();

        if(clothing instanceof Print){
            Print print=(Print) clothing;
            System.out.println("print is the instance of the clothing");
            print.design();
        }
    }
}

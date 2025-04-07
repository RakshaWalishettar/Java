package com.xworks.Inheritance.external;

public class Size extends Furniture{
    public void small() {
        System.out.println("the size of chair is small");
    }
    public void sit(Furniture furniture){
        furniture.move();
        furniture.adjustHeight();
        furniture.rotate();
        furniture.supportWeight();
        furniture.fold();

        if(furniture instanceof Size){
            Size size=(Size) furniture;
            System.out.println("size is the instance of furniture");
            size.small();

        }
    }
}

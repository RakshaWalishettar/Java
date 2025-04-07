package com.xworks.Inheritance.external;

public class Prchase extends Product{
    public void shopkeeper(){
        System.out.println("the purchase from shopkeeper");

    }
    public void customer(Product product){
        product.getPrice();
        product.getName();
        product.getStockQuantity();
        product.getExpiryDate();
        product.getCategory();

        if(product instanceof Prchase){
            Prchase prchase=(Prchase) product;
            System.out.println("the instance of the purchase is product");
            prchase.shopkeeper();
        }
    }
}

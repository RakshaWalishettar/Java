package com.xworkz.HierarchicalInheritance;

public class Product {
    void addToCart() {
        System.out.println("Product added to cart");
    }
}

class Clothing extends Product {
    void selectSize() {
        System.out.println("Size selected for clothing");
    }
}

class Electronics extends Product {
    void applyWarranty() {
        System.out.println("Warranty applied to electronics");
    }

    public static void main(String[] args) {
        Clothing clothes = new Clothing();
        clothes.addToCart();
        clothes.selectSize();

        Electronics gadget = new Electronics();
        gadget.addToCart();
        gadget.applyWarranty();
    }
}

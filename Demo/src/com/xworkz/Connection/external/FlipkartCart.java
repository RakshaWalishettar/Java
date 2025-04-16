package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.ShoppingCart;

public class FlipkartCart implements ShoppingCart {
    public void addItem() {
        System.out.println("Item added to Flipkart cart.");
    }

    public void removeItem() {
        System.out.println("Item removed from cart.");
    }

    public void checkout() {
        System.out.println("Checkout completed.");
    }

}

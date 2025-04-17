package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.FlipkartCart;
import com.xworkz.Connection.internal.ShoppingCart;

public class FlipkartCartRunner {
    public static void main(String[] args) {
        ShoppingCart cart = new FlipkartCart();
        cart.addItem();
        cart.removeItem();
        cart.checkout();
        cart.shopping();
    }
}

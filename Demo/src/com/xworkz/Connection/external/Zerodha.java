package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.StockTrading;

public class Zerodha implements StockTrading {
    public void buyStock() {
        System.out.println("Buying stock on Zerodha.");
    }

    public void sellStock() {
        System.out.println("Selling stock on Zerodha.");
    }

    public void viewPortfolio() {
        System.out.println("Viewing portfolio on Zerodha.");
    }

}

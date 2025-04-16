package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.Zerodha;
import com.xworkz.Connection.internal.StockTrading;

public class ZerodhaRunner {
    public static void main(String[] args) {
        StockTrading trading = new Zerodha();
        trading.buyStock();
        trading.sellStock();
        trading.viewPortfolio();
    }
}

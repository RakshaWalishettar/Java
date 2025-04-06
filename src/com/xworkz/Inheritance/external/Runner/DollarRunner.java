package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Currency;
import com.xworks.Inheritance.external.Dollar;

public class DollarRunner {
    public static void main(String[] args) {
        Dollar dollar = new Dollar();
        dollar.storeValue();
        dollar.serveAsUnit();
        dollar.measureValue();
        dollar.facilitateTrade();
        dollar.exchange();

        System.out.println("==================================");

        Currency currency1 = new Currency();
        currency1.exchange();
        currency1.facilitateTrade();
        currency1.measureValue();
        currency1.serveAsUnit();
        currency1.storeValue();
    }
}

package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.CurrencyConverter;

public class XEConverter implements CurrencyConverter {
    public void setSourceCurrency() {
        System.out.println("Setting source currency in XE Converter.");
    }

    public void setTargetCurrency() {
        System.out.println("Setting target currency in XE Converter.");
    }

    public void convertAmount() {
        System.out.println("Converting amount in XE Converter.");
    }
    @Override
    public void online() {
        System.out.println("Welcome!");
    }

}

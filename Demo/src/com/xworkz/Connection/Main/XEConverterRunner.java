package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.XEConverter;
import com.xworkz.Connection.internal.CurrencyConverter;

public class XEConverterRunner {
    public static void main(String[] args) {
        CurrencyConverter converter = new XEConverter();
        converter.setSourceCurrency();
        converter.setTargetCurrency();
        converter.convertAmount();
        converter.online();
    }
}

package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Converter;

public class ConversionService {
    private Converter converter;
    public ConversionService(Converter converter) {
        this.converter = converter;
        System.out.println("ConversionService initialized");
    }
    public void execute() {
        System.out.println("Performing conversion...");
        if (this.converter != null) {
            this.converter.convert();
        } else {
            System.out.println("no performance");

        }
    }
}

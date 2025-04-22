package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.ConversionService;
import com.xworkz.Implement.internal.Converter;
import com.xworkz.Implement.internal.TemperatureConverter;

public class ConverterRunner {
    public static void main(String[] args) {
        Converter converter = new TemperatureConverter();
        ConversionService service = new ConversionService(converter);
        service.execute();
    }
}

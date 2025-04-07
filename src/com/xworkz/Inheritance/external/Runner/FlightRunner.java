package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Brand;
import com.xworks.Inheritance.external.Flight;
import com.xworks.Inheritance.external.Transport;

public class FlightRunner {
    public static void main(String[] args){
        Flight flight = new Flight();
        flight.stop();
        flight.capacity();
        flight.service();
        flight.move();
        flight.fuel();

        System.out.println("=============================");
        Transport transport1 = new Transport();
        transport1.capacity();
        transport1.service();
        transport1.fuel();
        transport1.move();
        transport1.stop();

        System.out.println("===================================");
        Brand brand=new Brand();
        brand.crash(transport1);
        brand.crash(brand);
    }
}

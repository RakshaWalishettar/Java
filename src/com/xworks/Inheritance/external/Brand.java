package com.xworks.Inheritance.external;

public class Brand extends Transport{
    public void setabooking(){
        System.out.println("the seatbooking is available in the flight");
    }
    public void crash(Transport transport){
        transport.move();
        transport.fuel();
        transport.service();
        transport.capacity();
        transport.stop();

        if(transport instanceof Brand){
            Brand brand=(Brand) transport;
            System.out.println("the instance of the brand is transport");
            brand.setabooking();
        }
    }
}

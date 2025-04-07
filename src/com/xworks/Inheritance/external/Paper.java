package com.xworks.Inheritance.external;

public class Paper extends Currency{
    public void US(){
        System.out.println("the dollar id used in us");
    }
    public void money(Currency currency){
        currency.storeValue();
        currency.serveAsUnit();
        currency.measureValue();
        currency.exchange();
        currency.facilitateTrade();

        if(currency instanceof Paper){
            Paper paper=(Paper) currency;
            System.out.println("the paper instance is currency");
            paper.US();
        }
    }
}

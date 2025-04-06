package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Mobile;
import com.xworks.Inheritance.external.SmartPhone;

public class SmartPhoneRunner {
    public static void main(String[] args){
        Mobile mobile=new Mobile();
        mobile.Samsung();
        mobile.Redmi();
        mobile.Pixel();
        mobile.iPhone();
        mobile.OnePlus();

        System.out.println("=================================");
        SmartPhone smartPhone=new SmartPhone();
        smartPhone.Samsung();
        smartPhone.Redmi();
        smartPhone.Pixel();
        smartPhone.OnePlus();
        smartPhone.iPhone();
    }
}

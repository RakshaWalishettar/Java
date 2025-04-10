package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Phone;

public class PhoneRunner {
    public static void main(String[] args){
        Phone phone=new Phone("Black",'L',50);
        System.out.println(phone);

        int code = phone.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(phone));
    }
}

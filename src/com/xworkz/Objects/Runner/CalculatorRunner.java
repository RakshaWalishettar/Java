package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Calculator;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator("Casio", 'X', 24);
        Calculator calculator2=new Calculator("Casio",'P',6);
        System.out.println(calculator1);

        System.out.println("the calculator has:"+(calculator1==calculator2));
        boolean same=calculator1.equals(calculator2);
        System.out.println("both calculator1 and calculator2 are same :"+same);


        int code = calculator1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(calculator1));
    }
}

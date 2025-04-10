package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Calculator;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("Casio", 'X', 24);
        System.out.println(calculator);

        int code = calculator.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(calculator));
    }
}

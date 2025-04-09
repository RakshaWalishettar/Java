package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.PetStore;

public class PetStoreRunner {
    public static void main(String[] args) {
        PetStore p = new PetStore("PetWorld", 'D', 80);
        System.out.println(p);
    }
}

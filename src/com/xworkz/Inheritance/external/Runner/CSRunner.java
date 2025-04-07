package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.CardiacSurgeon;
import com.xworks.Inheritance.external.HeartAttack;
import com.xworks.Inheritance.external.Surgeon;

public class CSRunner {
    public static void main(String[] args){
        Surgeon surgeon=new Surgeon();
        surgeon.performSurgery();
        surgeon.performBypassSurgery();
        surgeon.conductHeartTransplant();
        surgeon.interpretECG();
        surgeon.monitorCardiacPatients();

        System.out.println("========================");

        CardiacSurgeon cardiacSurgeon=new CardiacSurgeon();
        cardiacSurgeon.monitorCardiacPatients();
        cardiacSurgeon.conductHeartTransplant();
        cardiacSurgeon.interpretECG();
        cardiacSurgeon.performSurgery();
        cardiacSurgeon.performBypassSurgery();

        System.out.println("========================");

        HeartAttack heartAttack=new HeartAttack();
        heartAttack.hospital(surgeon);
        heartAttack.hospital(heartAttack);
    }
}

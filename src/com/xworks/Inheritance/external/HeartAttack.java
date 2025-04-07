package com.xworks.Inheritance.external;

public class HeartAttack extends Surgeon{
    public void stiching(){
        System.out.println("the heartattack cause the dead");
    }
    public void hospital(Surgeon surgeon){
        surgeon.conductHeartTransplant();
        surgeon.interpretECG();
        surgeon.performBypassSurgery();
        surgeon.monitorCardiacPatients();
        surgeon.conductHeartTransplant();

        if(surgeon instanceof HeartAttack){
            HeartAttack heartAttack=(HeartAttack) surgeon;
            System.out.println("the onstance of the heartattack is surgury");
            heartAttack.stiching();
        }
    }
}

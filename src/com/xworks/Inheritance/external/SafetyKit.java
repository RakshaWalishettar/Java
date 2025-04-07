package com.xworks.Inheritance.external;

public class SafetyKit extends Footballer{
    public void gloves(){
        System.out.println("the gloves is the safety kit ");
    }
    public void boots(Footballer footballer){
        footballer.pass();
        footballer.rest();
        footballer.shoot();
        footballer.train();
        footballer.running();

        if(footballer instanceof SafetyKit){
            SafetyKit safetyKit=(SafetyKit)  footballer;
            System.out.println("the instance of the footballer is safetykit");
            safetyKit.gloves();
        }
    }
}

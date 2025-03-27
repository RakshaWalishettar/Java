package com.xworks.association.internal;

public class Voltage {
    private int unit;

    public Voltage(){
        System.out.println("no-arg const of Voltage");
    }

    public void passElectricity(){
        System.out.println("Running passElectricity in Voltage");
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getUnit() {
        return unit;
    }
}

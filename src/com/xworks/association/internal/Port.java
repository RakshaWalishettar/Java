package com.xworks.association.internal;


import com.xworks.association.internal.Constant.PortType;

public class Port {
    private PortType PT;

    public void port(){
        System.out.println("not conneted");
    }

    public void connected(){
        System.out.println("the port id been connected:"+PT);

    }

    public void setPT(PortType PT) {
        this.PT = PT;
    }

    public PortType getPT() {
        return PT;
    }
}


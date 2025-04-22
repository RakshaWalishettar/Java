package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Icc;

public class BCCI{
    private Icc icc;

    public BCCI(Icc icc){
        this.icc=icc;
        System.out.println("the icc is implemented in the Bcci");
    }
    public void match(){
        if(this.icc!=null){
            this.icc.fairplay();
            System.out.println("the fairplay implement in match");
        }
    }
}
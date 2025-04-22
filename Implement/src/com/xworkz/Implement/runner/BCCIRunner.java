package com.xworkz.Implement.runner;

import com.xworkz.Implement.internal.IndianCricketTeam;
import com.xworkz.Implement.external.BCCI;
import com.xworkz.Implement.internal.Icc;

public class BCCIRunner {
    public static void main(String[] args){
        IndianCricketTeam indianCricketTeam=new IndianCricketTeam();
        Icc icc=new IndianCricketTeam();
        BCCI bcci=new BCCI(icc);
        bcci.match();
        icc.fairplay();
        indianCricketTeam.fairplay();

    }
}

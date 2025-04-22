package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.Hospital;
import com.xworkz.Implement.internal.IndianHospital;
import com.xworkz.Implement.internal.WHO;

public class WHORunner {
    public static void main(String[] args) {
        WHO who=new IndianHospital();
        IndianHospital indianHospital=new IndianHospital();
        Hospital hospital=new Hospital(who);
        indianHospital.safetyStandards();
    }
}

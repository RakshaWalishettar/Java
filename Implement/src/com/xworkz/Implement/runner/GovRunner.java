package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.Government;
import com.xworkz.Implement.internal.CitizenConstitution;
import com.xworkz.Implement.internal.Consitution;

public class GovRunner {
    public static void main(String[] args) {
        CitizenConstitution citizenConstitution=new CitizenConstitution();
        Government government=new Government(citizenConstitution);
        citizenConstitution.folloeLaws();
        government.minister();
    }
}

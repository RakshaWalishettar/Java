package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Engineer;
import com.xworks.Inheritance.external.Staf;

public class StafRunner {
    public static void main(String[] args){
        Engineer eng=new Engineer();
        eng.debugSoftware();
        eng.writeCode();
        eng.getSpecialization();
        eng.workOnProject();
        eng.attendMeeting();

        System.out.println("=============================");
        Staf staf=new Staf();
        staf.writeCode();
        staf.workOnProject();
        staf.getSpecialization();
        staf.debugSoftware();
        staf.attendMeeting();
    }
}

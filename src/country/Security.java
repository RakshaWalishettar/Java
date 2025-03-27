package com.xworkz.country;
import java.util.Iterator;
import java.util.List;

class Security {
    String agency;
    int personnelCount;
    String securityLevel;
    List<Personnel> personnelList;

    public Security(String agency, int personnelCount, String securityLevel, List<Personnel> personnelList) {
        this.agency = agency;
        this.personnelCount = personnelCount;
        this.securityLevel = securityLevel;
        this.personnelList = personnelList;
    }

    public void display() {
        System.out.println("      Security: " + this.agency + " | Personnel Count: " + this.personnelCount + " | Level: " + this.securityLevel);
        Iterator var1 = this.personnelList.iterator();

        while(var1.hasNext()) {
            Personnel personnel = (Personnel)var1.next();
            personnel.display();
        }

    }
}
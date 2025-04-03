package com.xworks.Inheritance.external;

public class GovernmentHospital extends Hospital{
    public void governmentHospital() {
        System.out.println("GovernmentHospital constructor.");
    }

    {
        super.admitPatient();
        System.out.println("GovernmentHospital is admitting a patient with subsidized costs...");
    }

    {
        super.provideTreatment();
        System.out.println("GovernmentHospital is providing free treatment...");
    }

    {
        super.dischargePatient();
        System.out.println("GovernmentHospital is ensuring proper discharge procedures...");
    }

    {
        super.maintainRecords();
        System.out.println("GovernmentHospital is maintaining digital patient records...");
    }

    {
        super.manageStaff();
        System.out.println("GovernmentHospital is managing government-appointed staff...");
    }
}

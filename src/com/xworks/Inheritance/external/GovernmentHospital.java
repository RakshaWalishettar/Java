package com.xworks.Inheritance.external;

public class GovernmentHospital extends Hospital{
    public GovernmentHospital() {
        System.out.println("GovernmentHospital constructor.");
    }
    @Override
    public void admitPatient(){
        System.out.println("GovernmentHospital is admitting a patient with subsidized costs...");
    }
    @Override
    public void provideTreatment(){
        System.out.println("GovernmentHospital is providing free treatment...");
    }
    @Override
    public void dischargePatient(){
        System.out.println("GovernmentHospital is ensuring proper discharge procedures...");
    }
    @Override
    public void maintainRecords(){
        System.out.println("GovernmentHospital is maintaining digital patient records...");
    }
    @Override
    public void manageStaff(){
        System.out.println("GovernmentHospital is managing government-appointed staff...");
    }
    public void clean(){
        System.out.println("runner in hospita");
    }
}

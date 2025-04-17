package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.CityHospital;
import com.xworkz.Connection.internal.Hospital;

public class CityHospitalRunner {
    public static void main(String[] args) {
        Hospital h = new CityHospital();
        h.admitPatient();
        h.treatPatient();
        h.dischargePatient();
        h.greatHospital();
    }
}

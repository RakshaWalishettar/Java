package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Corporate;
import com.xworks.Inheritance.external.ManufacturingCompany;

public class ManufactureRunner {
    public static void main(String[] args) {
        ManufacturingCompany manufacturing= new ManufacturingCompany();
        manufacturing.qualityCheck();
        manufacturing.produceGoods();
        manufacturing.shipProducts();
        manufacturing.manageWorkers();
        manufacturing.maintainMachines();

        System.out.println("==============================");
        Corporate corporate= new Corporate();
        corporate.shipProducts();
        corporate.qualityCheck();
        corporate.produceGoods();
        corporate.manageWorkers();
        corporate.maintainMachines();
    }
}

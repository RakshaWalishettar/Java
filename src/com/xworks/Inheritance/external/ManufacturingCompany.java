package com.xworks.Inheritance.external;

public class ManufacturingCompany extends Corporate {
    public void manufacture() {
        System.out.println("ManufacturingCompany is manufacturing products.");
    }

    {
        super.manageWorkers();
        System.out.println("ManufacturingCompany is managing workers...");
    }

    {
        super.produceGoods();
        System.out.println("ManufacturingCompany is producing goods...");
    }

    {
        super.qualityCheck();
        System.out.println("ManufacturingCompany is performing quality check...");
    }

    {
        super.shipProducts();
        System.out.println("ManufacturingCompany is shipping products...");
    }

    {
        super.maintainMachines();
        System.out.println("ManufacturingCompany is maintaining machines...");
    }
}

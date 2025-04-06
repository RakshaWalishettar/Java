package com.xworks.Inheritance.external;

public class ManufacturingCompany extends Corporate {
    public ManufacturingCompany() {
        System.out.println("ManufacturingCompany is manufacturing products.");
    }
    @Override
    public void manageWorkers(){
        System.out.println("ManufacturingCompany is managing workers...");
    }
    @Override
    public void produceGoods(){
        System.out.println("ManufacturingCompany is producing goods...");
    }
    @Override
    public void qualityCheck(){
        System.out.println("ManufacturingCompany is performing quality check...");
    }
    @Override
    public void shipProducts(){
        System.out.println("ManufacturingCompany is shipping products...");
    }
    @Override
    public void maintainMachines(){
        System.out.println("ManufacturingCompany is maintaining machines...");
    }
}

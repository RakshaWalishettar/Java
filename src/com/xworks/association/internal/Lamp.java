package com.xworks.association.internal;

public class Lamp {
    private String colour="orange";
    private int cost=2000;
    private Warrenty warrenty;

    public void glow(){
        System.out.println("running glow in Lamp");
        if(warrenty != null){
            System.out.println("  Warranty : ");
            warrenty.setStartDate("12-01-2025");
            warrenty.setEndDate("10-01-2030");

            System.out.println("Warranty start date : "+warrenty.getStartDate());
            System.out.println("Warranty end date : "+warrenty.getEndDate());
        }
    }

    public Lamp(Warrenty warranty){
        System.out.println("1-arg const of Lamp");
        this.warrenty = warranty;
    }

    public void setColor(String color) {
        this.colour = color;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return colour;
    }

    public int getCost() {
        return cost;
    }

    public void setWarranty(Warrenty warranty) {
        this.warrenty = warranty;
    }

    public Warrenty getWarranty() {
        return warrenty;
    }
}




package com.xworks.Inheritance.external;

public class HomeLone extends Lone{
    public HomeLone()
    {
        System.out.println("no-args const of Homelone");
    }@Override
    public void calculate_equity(){
        System.out.println("runner calculate_equity of Homelone");
    }@Override
    public void property_tax(){
        System.out.println("runner property_tax of Homelone");
    }@Override
    public void total_monthly_cost(){
        System.out.println("runner total_monthly_cost of Homelone");
    }@Override
    public void refinance(){
        System.out.println("runner refinance of Homelone");
    }@Override
    public void sign(){
        System.out.println("runner sign of Homelone");
    }

}

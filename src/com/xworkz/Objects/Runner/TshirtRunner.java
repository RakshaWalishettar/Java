package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Tshirt;

public class TshirtRunner {
    public static void main(String[] args){
        Tshirt tshirt1=new Tshirt("max",35,"black");

        Tshirt tshirt2=new Tshirt("Westside",40,"Red");

        System.out.println("the tshirt has:"+(tshirt1==tshirt2));
        boolean same=tshirt1.equals(tshirt2);
        System.out.println("both tshirt1 and tshirt2 are same :"+same);


    }
}

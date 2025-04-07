package com.xworks.Inheritance.external;

public class Varity extends Plant{
    public void smell(){
        System.out.println("the varity of flower have the smell");
    }
    public void petal(Plant plant){
        plant.photosynthesize();
        plant.grow();
        plant.releaseOxygen();
        plant.bloom();
        plant.absorbWater();

        if (plant instanceof Varity){
            Varity varity=(Varity) plant;
            System.out.println("the instance of the plant is varity");
            varity.smell();
        }
    }
}

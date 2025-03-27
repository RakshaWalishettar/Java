package com.xworks.association.internal;

public class Button {
    private int noofButton;
    private Material material;

    public Button(Material material){
        System.out.println("1-arg const of Button");
        this.material = material;
    }

    public void Function(){
        System.out.println("Running function in Remote");
        if(material != null){
            System.out.println(" Button:");
            material.setMaterialType("Plastic");
            System.out.println("Material Type : "+this.material.getMaterialType());
        }
    }

    public void setnoofButton(int noOfButton) {
        this.noofButton = noofButton;
    }

    public int getNoOfButton() {
        return noofButton;
    }

}

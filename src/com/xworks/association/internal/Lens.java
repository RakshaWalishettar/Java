package com.xworks.association.internal;

public class Lens {
    private String type="Telephoto";
    private int resolution=85;

    public void focus(){
        System.out.println("Running focus in Len");
    }

    public Lens(String type){
        System.out.println("the type of lens:"+type);
    }

    public Lens(int resolution){
        System.out.println("the resoultion of the lens:"+resolution);
    }

    public void settype(String name){
        this.type=name;
    }

    public void setResolution(int resolution){
        this.resolution=resolution;
    }

    public String gettype() {
            return type;
    }

    public int getResolution() {
        return resolution;
    }

}

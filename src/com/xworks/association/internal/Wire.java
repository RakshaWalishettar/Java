package com.xworks.association.internal;

public class Wire {
    private String type="copper";
    private int length=80;


    private Quanlity quality;

    public Wire(Quanlity quality){
        System.out.println("1-arg Wire const");
        this.quality = quality;
    }

    public void transferData(){
        System.out.println("Running transferData in Wire");
        if(quality != null){
            quality.setType("Medium");
            System.out.println("   Quality: ");

            System.out.println("Quality type : "+quality.getType());
        }
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void settype(String type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public String gettype() {
        return type;
    }

    public String type(String copper) {
            return null;
    }
}

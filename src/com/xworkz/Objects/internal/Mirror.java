package com.xworkz.Objects.internal;

public class Mirror {
    private String shape;
    private char frameType;
    private int size;

    public Mirror(String shape, char frameType, int size) {
        this.shape = shape;
        this.frameType = frameType;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Mirror)
            {
                System.out.println("ref is beer, will compare...");
                Mirror mirror1=this;
                Mirror mirror2=(Mirror) obj;//why should i do casting ??
                if(mirror1.shape.equals(mirror2.shape) && mirror1.frameType==mirror2.frameType )
                {
                    System.out.println("both mirrors are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Mirror [shape=" + shape + ", frameType=" + frameType + ", size=" + size + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -41;
    }
}

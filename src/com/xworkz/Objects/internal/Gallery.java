package com.xworkz.Objects.internal;

public class Gallery {
    private String name;
    private char artType;
    private int pieces;

    public Gallery(String name, char artType, int pieces) {
        this.name = name;
        this.artType = artType;
        this.pieces = pieces;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Gallery)
            {
                System.out.println("ref is gallery, will compare...");
                Gallery gallery1=this;
                Gallery gallery2=(Gallery) obj;//why should i do casting ??
                if(gallery1.name.equals(gallery2.name) && gallery1.artType==gallery2.artType )
                {
                    System.out.println("both gallery are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Gallery [name=" + name + ", artType=" + artType + ", pieces=" + pieces + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 42;
    }
}

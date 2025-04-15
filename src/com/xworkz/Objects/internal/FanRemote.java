package com.xworkz.Objects.internal;

public class FanRemote {
    private String brand;
    private char mode;
    private int buttons;

    public FanRemote(String brand, char mode, int buttons) {
        this.brand = brand;
        this.mode = mode;
        this.buttons = buttons;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof FanRemote)
            {
                System.out.println("ref is beer, will compare...");
                FanRemote fanRemote1=this;
                FanRemote fanRemote2=(FanRemote) obj;//why should i do casting ??
                if(fanRemote1.brand.equals(fanRemote2.brand) && fanRemote1.mode==fanRemote2.mode )
                {
                    System.out.println("both FanRemote are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "FanRemote [brand=" + brand + ", mode=" + mode + ", buttons=" + buttons + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 38;
    }
}

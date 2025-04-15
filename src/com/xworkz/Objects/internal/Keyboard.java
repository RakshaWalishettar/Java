package com.xworkz.Objects.internal;

public class Keyboard {
    private String layout;
    private char type;
    private int keys;

    public Keyboard(String layout, char type, int keys) {
        this.layout = layout;
        this.type = type;
        this.keys = keys;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Keyboard)
            {
                System.out.println("ref is keyboard, will compare...");
                Keyboard keyboard1=this;
                Keyboard keyboard2=(Keyboard) obj;//why should i do casting ??
                if(keyboard1.layout.equals(keyboard2.layout) && keyboard1.type==keyboard2.type )
                {
                    System.out.println("both Keyboard are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Keyboard [layout=" + layout + ", type=" + type + ", keys=" + keys + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -50;
    }
}

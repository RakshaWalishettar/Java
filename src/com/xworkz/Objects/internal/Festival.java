package com.xworkz.Objects.internal;

public class Festival {
    private String name;
    private char type;
    private int days;

    public Festival(String name, char type, int days) {
        this.name = name;
        this.type = type;
        this.days = days;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Festival)
            {
                System.out.println("ref is Festival, will compare...");
                Festival festival1=this;
                Festival festival2=(Festival) obj;//why should i do casting ??
                if(festival1.name.equals(festival2.name) && festival1.type==festival2.type )
                {
                    System.out.println("both festival are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Festival [name=" + name + ", type=" + type + ", days=" + days + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 40;
    }
}

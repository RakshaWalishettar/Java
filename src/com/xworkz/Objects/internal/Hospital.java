package com.xworkz.Objects.internal;

public class Hospital {
    private String name;
    private char type;
    private int beds;

    public Hospital(String name, char type, int beds) {
        this.name = name;
        this.type = type;
        this.beds = beds;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Hospital)
            {
                System.out.println("ref is hospital, will compare...");
                Hospital hospital1=this;
                Hospital hospital2=(Hospital) obj;//why should i do casting ??
                if(hospital1.name.equals(hospital2.name) && hospital1.type==hospital2.type )
                {
                    System.out.println("both hospital are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hospital [name=" + name + ", type=" + type + ", beds=" + beds + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 47;
    }
}

package com.xworkz.Objects.internal;

public class FireStation {
    private String location;
    private char zone;
    private int vehicles;

    public FireStation(String location, char zone, int vehicles) {
        this.location = location;
        this.zone = zone;
        this.vehicles = vehicles;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof FireStation)
            {
                System.out.println("ref is beer, will compare...");
                FireStation fireStation1=this;
                FireStation fireStation2=(FireStation) obj;//why should i do casting ??
                if(fireStation1.location.equals(fireStation2.location) && fireStation1.zone==fireStation2.zone )
                {
                    System.out.println("both Firestation are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "FireStation [location=" + location + ", zone=" + zone + ", vehicles=" + vehicles + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 41;
    }
}

package com.xworkz.Objects.internal;

public class Fan {
    private String brand;
    private int speedLevels;
    private boolean hasRemote;

    public Fan(String brand, int speedLevels, boolean hasRemote) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.hasRemote = hasRemote;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Fan)
            {
                System.out.println("ref is beer, will compare...");
                Fan fan1=this;
                Fan fan2=(Fan) obj;//why should i do casting ??
                if(fan1.brand.equals(fan2.brand) && fan1.speedLevels==fan2.speedLevels )
                {
                    System.out.println("both Fan are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Fan [brand=" + brand + ", speedLevels=" + speedLevels + ", hasRemote=" + hasRemote + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 37;
    }
}

package com.xworkz.Objects.internal;

public class MetroStation {
    private String name;
    private char line;
    private int frequency;

    public MetroStation(String name, char line, int frequency) {
        this.name = name;
        this.line = line;
        this.frequency = frequency;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof MetroStation)
            {
                System.out.println("ref is metrostation, will compare...");
                MetroStation metroStation1=this;
                MetroStation metroStation2=(MetroStation) obj;//why should i do casting ??
                if(metroStation1.name.equals(metroStation2.name) && metroStation1.line==metroStation2.line )
                {
                    System.out.println("both metrostation are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MetroStation [name=" + name + ", line=" + line + ", frequency=" + frequency + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 43;
    }
}

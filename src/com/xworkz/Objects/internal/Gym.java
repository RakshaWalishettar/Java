package com.xworkz.Objects.internal;

public class Gym {
    private String gymName;
    private char membershipType;
    private int trainers;

    public Gym(String gymName, char membershipType, int trainers) {
        this.gymName = gymName;
        this.membershipType = membershipType;
        this.trainers = trainers;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Gym)
            {
                System.out.println("ref is gym, will compare...");
                Gym gym1=this;
                Gym gym2=(Gym) obj;//why should i do casting ??
                if(gym1.gymName.equals(gym2.gymName) && gym1.membershipType==gym2.membershipType )
                {
                    System.out.println("both gym are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Gym [gymName=" + gymName + ", membershipType=" + membershipType + ", trainers=" + trainers + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 45;
    }
}

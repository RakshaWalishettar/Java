package com.xworkz.Objects.internal;

public class Hotel {
    private String name;
    private char rating;
    private int rooms;

    public Hotel(String name, char rating, int rooms) {
        this.name = name;
        this.rating = rating;
        this.rooms = rooms;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Hotel)
            {
                System.out.println("ref is beer, will compare...");
                Hotel hotel1=this;
                Hotel hotel2=(Hotel) obj;
                if(hotel1.name.equals(hotel2.name) && hotel1.rating==hotel2.rating )
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
        return "Hotel [name=" + name + ", rating=" + rating + ", rooms=" + rooms + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 49;
    }
}

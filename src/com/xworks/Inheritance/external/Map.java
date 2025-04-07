package com.xworks.Inheritance.external;

public class Map extends  Schedule {
    public void roadMap(Schedule schedule){
        System.out.println("the trian has the map");

        if(schedule instanceof Map){
            Map map=(Map) schedule;
            System.out.println("road map help the public");
        }
    }
}

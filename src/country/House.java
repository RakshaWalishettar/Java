package com.xworkz.country;
import java.util.List;


class House {
    String address;
    int rooms;
    List<Room> roomList;
    List<Housekeep> houseKeeps;

    public House(String address, int rooms, List<Room> roomList, List<Housekeep> houseKeeps) {
        this.address = address;
        this.rooms = rooms;
        this.roomList = roomList;
        this.houseKeeps = houseKeeps;
    }

    public void display() {
        System.out.println("      House Address: " + address + " | Rooms: " + rooms);
        for (Room room : roomList) {
            room.display();
        }
        for (Housekeep hk : houseKeeps) {
            hk.display();
        }
    }
}



package com.bilgeadam.model.comkposition;

public class House {
    private Room room;

    public House(){
        this.room = new Room("Mutfak");
        this.toString();
    }

    @Override
    public String toString(){
        return this.room.getName();
    }
}

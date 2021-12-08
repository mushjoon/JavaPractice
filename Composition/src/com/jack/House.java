package com.jack;

public class House {

    private LivingRoom myLivingRoom;
    private Kitchen myKitchen;


    public House(LivingRoom myLivingRoom, Kitchen myKitchen) {
        this.myLivingRoom = myLivingRoom;
        this.myKitchen = myKitchen;
    }

    public void showInfoOfHouse() {
        System.out.println("My kitchen has " + myKitchen.getChairs() + " chairs and " + myKitchen.getTables() + " tables");
        System.out.println("In our living room, we have " + myLivingRoom.getNumOfTV() + " " + myLivingRoom.getTvBrand() + " TV");
        System.out.println("We are cooking " + myKitchen.getMyOven().getFood() + " at temp of " + myKitchen.getMyOven().getTemperature());
    }
}

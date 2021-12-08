package com.jack;

public class Car extends Vehicle{

    private int seats;
    private String color;

    public Car(String steering, int gears, int moving, int seats, String color) {
        super(steering, gears, moving);
        this.seats = 4;
        this.color = "Blue";
    }

    @Override
    public void engineStart() {
        super.engineStart();
        System.out.println("I am a Car method!!! I am overriding Vehicle's engineStart()");
    }

    public void driveToMall(String destination) {
        System.out.println("I am gonna drive to " + destination);
    }
}

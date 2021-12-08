package com.jack;

public class Volvo extends Car{

    private int safetyScore;

    public Volvo(String steering, int gears, int moving, int seats, String color, int safetyScore) {
        super(steering, gears, moving, seats, color);
        this.safetyScore = safetyScore;
    }

    @Override
    public void driveToMall(String destination) {
        //super.driveToMall(destination);
        System.out.println("I am driving Volvo to go to " + destination);
    }
}

package com.jack;

public class Vehicle {

    private String steering;
    private int gears;
    private int moving;

    public Vehicle() {

    }

    public Vehicle(String steering, int gears, int moving) {
        this.steering = steering;
        this.gears = gears;
        this.moving = moving;
    }

    public void engineStart() {
        System.out.println("Vehicle engineStart() method");
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getMoving() {
        return moving;
    }

    public void setMoving(int moving) {
        this.moving = moving;
    }
}

package com.jack;

public class Oven {

    private int temperature;
    private String food;

    public Oven(int temperature, String food) {
        this.temperature = temperature;
        this.food = food;
    }

    public void cookFood(Oven oven) {
        System.out.println("Cooking " + oven.food + " at temperature of " + oven.temperature + " degrees celcius");
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}

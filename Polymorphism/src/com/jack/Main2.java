package com.jack;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerate()";
    }

    @Override
    public String brake() {
        return "Holden -> brake()";
    }
}

class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

public class Main2 {

    public static void main(String[] args) {
        Car myCar = new Car(8,"Test Car");
        System.out.println(myCar.startEngine());
        System.out.println(myCar.accelerate());
        System.out.println(myCar.brake());

        System.out.println("===================================");

        Mitsubishi myMitsubishi = new Mitsubishi(6,"AE86");
        System.out.println(myMitsubishi.startEngine());
        System.out.println(myMitsubishi.accelerate());
        System.out.println(myMitsubishi.brake());

        System.out.println("===================================");

        Ford myFord = new Ford(4,"F150");
        System.out.println(myFord.startEngine());
        System.out.println(myFord.accelerate());
        System.out.println(myFord.brake());

        System.out.println("===================================");

        Holden myHolden= new Holden(6,"Commodore");
        System.out.println(myHolden.startEngine());
        System.out.println(myHolden.accelerate());
        System.out.println(myHolden.brake());
    }
}

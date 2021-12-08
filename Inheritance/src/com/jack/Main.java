package com.jack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car myCar = new Car("Left",4,10,5,"Black");
        System.out.println("I am driving " + myCar.getSteering());

        System.out.println("I'm gonna change direction......");

        myCar.setSteering("Right");
        System.out.println("Now I'm driving " + myCar.getSteering());
        myCar.driveToMall("Costco");

        System.out.println("Now we are declaring Volvo class.....\n");
        Volvo myVolvo = new Volvo("Straight",6,12,3,"Blue",10);
        myVolvo.driveToMall("Emart");
    }
}

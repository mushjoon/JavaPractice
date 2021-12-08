package com.jack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Below is a wrong way of doing things
//        Player player = new Player();
//        player.fullName = "Jack";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        // Better way to do things
//        EnhancedPlayer player = new EnhancedPlayer("Jack",50,"Sword");
//        System.out.println("Initial health is " + player.getHealth());

        Printer myPrinter = new Printer(70,true);
        myPrinter.fillUpToner(20);
        myPrinter.printPages(5);
    }
}

package com.jack;

public class BillsBurgerApp {

    public static void main(String[] args) {

        BaseHamburger myHamburger = new BaseHamburger("Basic","White","Sausage", 3.56);
        double price = myHamburger.itemizeHamburger();
        myHamburger.addExtra1("Tomato",1.55);
        myHamburger.addExtra2("Lettuce", 0.75);
        myHamburger.addExtra3("Cheese", 1.25);
        System.out.println("Total price: " + myHamburger.itemizeHamburger());

        System.out.println("========================================");

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",4.20);
        healthyBurger.addHealthExtra1("Avocado", 1.40);
        healthyBurger.addHealthExtra2("Lentils", .50);
        System.out.println("Total price: " + healthyBurger.itemizeHamburger());

        System.out.println("========================================");
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addExtra3("you can't do this", 30.3);
        System.out.println("Total price: " + deluxeBurger.itemizeHamburger());
    }
}

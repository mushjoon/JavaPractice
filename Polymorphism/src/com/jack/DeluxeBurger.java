package com.jack;

public class DeluxeBurger extends BaseHamburger{

    public DeluxeBurger() {
        super("Deluxe", "White", "Steak", 11.50);
        super.addExtra1("Chips",2.75);
        super.addExtra2("Drink", 1.50);
    }

    @Override
    public void addExtra1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addExtra2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addExtra3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addExtra4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}

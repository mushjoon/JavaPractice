package com.jack;

public class BaseHamburger {

    private String name;
    private String bread;
    private String meat;
    private double basePrice = 2.0;

    private String extra1;
    private double extra1Price;

    private String extra2;
    private double extra2Price;

    private String extra3;
    private double extra3Price;

    private String extra4;
    private double extra4Price;

    public BaseHamburger(String name, String bread, String meat, double basePrice) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public void addExtra1(String name, double price) {
        this.extra1 = name;
        this.extra1Price = price;
    }
    public void addExtra2(String name, double price) {
        this.extra2 = name;
        this.extra2Price = price;
    }
    public void addExtra3(String name, double price) {
        this.extra3 = name;
        this.extra3Price = price;
    }
    public void addExtra4(String name, double price) {
        this.extra4 = name;
        this.extra4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.basePrice;
        System.out.println(this.name + " hamburger" + " on a " + this.bread + " bun" + " price is " + this.basePrice);
        if (this.extra1 != null) {
            hamburgerPrice += this.extra1Price;
            System.out.println("Added " + this.extra1 + " for an extra " + this.extra1Price + " dollars");
        }
        if (this.extra2 != null) {
            hamburgerPrice += this.extra2Price;
            System.out.println("Added " + this.extra2 + " for an extra " + this.extra2Price + " dollars");
        }
        if (this.extra3 != null) {
            hamburgerPrice += this.extra3Price;
            System.out.println("Added " + this.extra3 + " for an extra " + this.extra3Price + " dollars");
        }
        if (this.extra4 != null) {
            hamburgerPrice += this.extra4Price;
            System.out.println("Added " + this.extra4 + " for an extra " + this.extra4Price + " dollars");
        }
        return hamburgerPrice;
    }

}

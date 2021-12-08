package com.jack;

public class Kitchen {

    private Oven myOven;
    private int tables;
    private int chairs;

    public Kitchen(Oven myOven, int tables, int chairs) {
        this.myOven = myOven;
        this.tables = tables;
        this.chairs = chairs;
    }

    public void prepareMeal() {
        System.out.println("We have " + tables + " tables and " + chairs + " chairs");
        System.out.println();
    }

    public Oven getMyOven() {
        return myOven;
    }

    public void setMyOven(Oven myOven) {
        this.myOven = myOven;
    }

    public int getTables() {
        return tables;
    }

    public void setTables(int tables) {
        this.tables = tables;
    }

    public int getChairs() {
        return chairs;
    }

    public void setChairs(int chairs) {
        this.chairs = chairs;
    }
}

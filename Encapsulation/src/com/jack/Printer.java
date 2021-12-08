package com.jack;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void fillUpToner(int fillAmount) {
        if (this.tonerLevel + fillAmount > 100) {
            System.out.println("Max toner level is 100!!!");
        } else {
            this.tonerLevel += fillAmount;
        }
    }

    public void printPages(int pagesToPrint) {
        System.out.println("Current Toner Level: " + this.tonerLevel);
        this.pagesPrinted += pagesToPrint;
        System.out.println("Pages Printed so far: " + this.pagesPrinted);
        if (isDuplexPrinter) {
            System.out.println("I am printing on double sides!!!");
        }
    }
}

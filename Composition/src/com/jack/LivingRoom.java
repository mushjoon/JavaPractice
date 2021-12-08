package com.jack;

public class LivingRoom {

    private String tvBrand;
    private int numOfTV;

    public LivingRoom(String tvBrand, int numOfTV) {
        this.tvBrand = tvBrand;
        this.numOfTV = numOfTV;
    }

    public void watchingTV() {
        System.out.println("We are watching " + tvBrand + " TV and we have " + numOfTV + " TVs in our living room");
    }

    public String getTvBrand() {
        return tvBrand;
    }

    public void setTvBrand(String tvBrand) {
        this.tvBrand = tvBrand;
    }

    public int getNumOfTV() {
        return numOfTV;
    }

    public void setNumOfTV(int numOfTV) {
        this.numOfTV = numOfTV;
    }
}

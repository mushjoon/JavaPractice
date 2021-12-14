package com.jack.Interface;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone jacksPhone;
        jacksPhone = new DeskPhone(123456);
        jacksPhone.powerOn();
        jacksPhone.callPhone(123456);
        jacksPhone.answer();

        System.out.println("====================================");
        jacksPhone = new MobilePhone(23465);
        jacksPhone.powerOn();
        jacksPhone.callPhone(23465);
        jacksPhone.answer();
    }
}

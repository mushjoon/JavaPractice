package com.jack;

import java.util.Scanner;

public class XMain {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        X X = new X();
        System.out.println("Enter your number: ");
        int x = scanner.nextInt();
        X.x(x);

    }
}

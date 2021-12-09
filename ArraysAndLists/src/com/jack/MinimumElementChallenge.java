package com.jack;

import java.util.Scanner;

public class MinimumElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the count: ");
        int cnt = scanner.nextInt();
        int[] theArray = readIntegers(cnt);
        System.out.println("The min value is : " + findMin(theArray));
    }

    public static int[] readIntegers(int count) {
        int[] myArray = new int[count];
        System.out.println("Enter your " + count + " integers:\r");
        for (int i=0; i<myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    public static int findMin(int[] array) {
        int minValue = Integer.MAX_VALUE;

        for (int i=0; i<array.length; i++) {
            int value = array[i];
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }
}

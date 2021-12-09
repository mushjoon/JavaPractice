package com.jack;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge1 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = getIntegers(5);
        printArray(myIntArray);
        System.out.println("\nSorting the array......");
        printArray(sortArray(myIntArray));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter your " + number + " integers: \r");
        int[] newArray = new int[number];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }

    public static void printArray(int[] targetArray) {
        for (int i = 0; i < targetArray.length; i++) {
            System.out.println("Element " + i + ", value: " + targetArray[i]);
        }
    }

    public static int[] sortArray(int[] messyArray) {
//        int[] sortedArray = new int[messyArray.length];
//
//        for (int i=0; i<messyArray.length; i++) {
//            sortedArray[i] = messyArray[i];
//        }

        int[] sortedArray = Arrays.copyOf(messyArray, messyArray.length);

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}

package com.jack.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the count:");
        int count = scanner.nextInt();
        int[] originalArray = readIntegers(count);
        System.out.println("Here is the original array: " + Arrays.toString(originalArray));
        reverseArray(originalArray);
        System.out.println("Reversed array: " + Arrays.toString(originalArray));
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter your " + count + " integers:\r");
        for (int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void reverseArray(int[] array) {

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i=0; i<halfLength; i++) {
            int tmp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = tmp;
        }
    }
}

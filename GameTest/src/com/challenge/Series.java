package com.challenge;

import java.util.Arrays;

public class Series {

    public static void main(String[] args) {
        System.out.println(nSum(5));
        System.out.println(factorial(16));
        System.out.println(fibonacci(10));
    }
    public static long nSum(int n) {
        long sum = 0;
        for (int i=0; i<=n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long factorial(int n) {
        long factorial = 1;
        if (n == 1) {
            return factorial;
        } else if (n == 2) {
            factorial = 2;
            return factorial;
        } else {
            for (int i=2; i<= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    public static long fibonacci(int n) {
        if (n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        }
        long nMinus1 = 1;
        long nMinus2 = 0;
        long fib = 0;

        for (int i=1; i<n; i++) {
            fib = (nMinus2 + nMinus1);
            nMinus2 = nMinus1;
            nMinus1 = fib;
        }
        return fib;
    }
}

package com.dsa.arrays.basic;

import java.util.function.Predicate;

public class PrimeNumber {
    public static Predicate<? super Integer> isPrime;

    public static void main(String[] args) {
        int num = 29;
        System.out.println(isPrime(num) ? num + " is a Prime Number" : num + " is Not a Prime Number");
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2 || num == 3) return true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

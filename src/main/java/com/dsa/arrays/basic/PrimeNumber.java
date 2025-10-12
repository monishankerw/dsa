package com.dsa.arrays.basic;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 29;
        System.out.println(isPrime(num) ? num + " is a Prime Number" : num + " is Not a Prime Number");
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2 || num == 3) return true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

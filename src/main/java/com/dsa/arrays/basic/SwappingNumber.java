package com.dsa.arrays.basic;

public class SwappingNumber {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 0;
        System.out.println("Before Swapping: a = " + a + ", b = " + b);
        swappingWithoutTwoVariable(a, b);
        swappingWithTwoVariable(a, b, c);

    }


    private static void swappingWithoutTwoVariable(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }

    private static void swappingWithTwoVariable(int a, int b, int c) {
        c = a;
        a = b;
        b = c;
        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}

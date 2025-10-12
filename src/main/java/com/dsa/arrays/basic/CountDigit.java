package com.dsa.arrays.basic;

public class CountDigit {
    public static void main(String[] args) {
        int num = 123456;
        int count = 0;
        int org_num = num;

        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num /= 10;
                count++;
            }
        }

        System.out.println("Number of digits in " + org_num + " = " + count);
    }
}

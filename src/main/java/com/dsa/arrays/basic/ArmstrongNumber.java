package com.dsa.arrays.basic;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int org_num = num, sum = 0;
        int r;
        while (num != 0) {
            r = num % 10;
            sum += r * r * r;
            num /= 10;
        }
        System.out.println(org_num ==sum? "Arm Strong" : "Not Arm St");

    }
}

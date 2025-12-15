package com.dsa;

public class Questions {
    public static void main(String[] args) {
        int num = 153;
        int r, sum = 0, org_num = num;
        while (num != 0) {
            r = num % 10;
            sum += r * r * r;
            num /= 10;
        }
        System.out.println(org_num ==sum? "A" : "N");


    }
}

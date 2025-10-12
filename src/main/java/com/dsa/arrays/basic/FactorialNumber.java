package com.dsa.arrays.basic;

public class FactorialNumber {
    public static void main(String[] args) {
        int f=1,num=5;
        for (int i=1;i<=num;i++){
            f*=i;
        }
        System.out.println("Fac::"+f);
    }
}

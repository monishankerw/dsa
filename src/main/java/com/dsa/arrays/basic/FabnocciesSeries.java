package com.dsa.arrays.basic;

public class FabnocciesSeries {
    public static void main(String[] args) {
        int a=0,b=1,c;
        System.out.println(a+" "+b);
        for (int i=2;i<7;i++){
            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }
        System.out.println();
    }
}

package com.dsa.arrays.basic;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 12321;
        int rev=0;
        int org_num=num;
        while (num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println(org_num == rev ? "Palindrome Num" : "Not Palindrome");


    }
}

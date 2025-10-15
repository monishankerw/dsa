package com.dsa.string.mediam;

public class LongestPreSufx {
    public static void main(String[] args) {
        String str = "ababcababc";
        String result=longestPreSufix(str);
        System.out.println("PRE::"+result);
    }

    private static String longestPreSufix(String str) {
        int n = str.length();
        String preSufix = "";
        for (int i = 0; i < n / 2; i++) {
            if(str.substring(0,i+1).equals(str.substring(n-i-1))){
                preSufix=str.substring(0,i+1);
            }
        }
        return preSufix;
        }
    }

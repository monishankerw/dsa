package com.dsa.string;

public class ReverseString {
    public static void main(String[] args) {
        String str="Java Developer";
       String rev= reverseString(str);
        System.out.println("Reverse String:"+rev);
        String revs= reverseStringJava8(str);
        System.out.println("Reverse String:"+revs);

    }


    private static String reverseString(String str) {
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev;
    }
    private static String reverseStringJava8(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}

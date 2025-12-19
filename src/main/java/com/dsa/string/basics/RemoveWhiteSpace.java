package com.dsa.string.basics;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str="Hello World";
        StringBuilder sb=new StringBuilder();
        for (char ch:str.toCharArray()){
            if(!Character.isWhitespace(ch)){
                sb.append(ch);
            }
        }
        System.out.println("Remove White Space.."+sb.toString());
    }
}

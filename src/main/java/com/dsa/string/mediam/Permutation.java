package com.dsa.string.mediam;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {

        String str = "abc";
        List<String> perms = new ArrayList<>();
        generatePermss(str, "", perms);
        System.out.println(perms);

    }

    private static void generatePermss(String str, String prefix, List<String> perms) {
        if(str.isEmpty()){
            perms.add(prefix);
        }else {
            for (int i=0;i<str.length();i++){
                String newPrefix=prefix+str.charAt(i);
                String remaining=str.substring(0,i)+str.substring(i+1);
                generatePermss(remaining,newPrefix,perms);
            }
        }
    }
}

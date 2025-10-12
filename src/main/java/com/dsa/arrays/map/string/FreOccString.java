package com.dsa.arrays.map.string;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreOccString {
    public static void main(String[] args) {
        String str="teretrerttee";
        freOccString(str);
        freOccStringJava8(str);
    }


    private static void freOccString(String str) {
        Map<Character,Integer> map=new HashMap<>();
        for (char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
    private static void freOccStringJava8(String str) {
        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }

}

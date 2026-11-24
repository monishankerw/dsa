package com.dsa.arrays.ArraysQuestion;


import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,4,5};
        int k=1;
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        List<Integer>occ= map.entrySet().stream().filter(e->e.getValue()==k).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(occ);
    }
}


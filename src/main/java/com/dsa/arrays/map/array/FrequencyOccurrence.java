package com.dsa.arrays.map.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOccurrence {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,3,4,5,6,5,4,3};
        freOcc(arr);
        freOccJava8(arr);
    }


    private static void freOcc(int[] arr) {
        Map<Integer,Long> map=new HashMap<>();
        for (int num:arr){
            map.put(num,map.getOrDefault(num,0L)+1);
        }
        System.out.println("Fre Occ:"+map);
    }
    private static void freOccJava8(int[] arr) {
        Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(map);
    }

}

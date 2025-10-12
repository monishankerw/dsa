package com.dsa.arrays.map.array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementAppearingExactlyKTime {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3};
        int k=2;
        elementsKthFreq(arr,k);
    }

    private static void elementsKthFreq(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list = map.entrySet().stream().filter(e -> e.getValue() == k)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(list);
    }
}

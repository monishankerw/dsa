package com.dsa.arrays.map.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequenceElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 6, 7, 5, 4, 5};
        mostFreElements(arr);
        mostFreElementsJava8(arr);


    }


    private static void mostFreElements(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int mostFreq = -1, maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFreq = entry.getKey();
            }
        }
        System.out.println(mostFreq);
    }

    private static void mostFreElementsJava8(int[] arr) {
        Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        Integer i = map.entrySet().stream().max((Map.Entry.comparingByValue())).map(Map.Entry::getKey).orElse(-1);
        System.out.println(i);
    }


}

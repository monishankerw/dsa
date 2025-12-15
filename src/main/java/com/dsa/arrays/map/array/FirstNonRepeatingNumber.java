package com.dsa.arrays.map.array;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3, 4, 5, 4, 6};
        firstNonRepeatingNumber(arr);
        firstNonRepeatingNumberJava8(arr);
    }


    private static Integer firstNonRepeatingNumber(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return -1;
    }

    private static void firstNonRepeatingNumberJava8(int[] arr) {
        Optional<Map.Entry<Integer, Long>> first = Arrays.stream(arr).boxed().collect
                        (Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).findFirst();
              System.out.println(first);
    }
}

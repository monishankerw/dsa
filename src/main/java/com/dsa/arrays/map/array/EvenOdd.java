package com.dsa.arrays.map.array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println("Even:"+map.get(true));
        System.out.println("Odd:"+map.get(false));
    }
}

package com.dsa.arrays.ArraysQuestion;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 2, 1, 3, 4, 3};
        int k = 2;

        Map<Integer, Long> map = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        map.entrySet().stream()
                .filter(entry -> entry.getValue() >= k)
                .max(Map.Entry.comparingByValue())
                .ifPresent(entry -> System.out.println(entry.getKey()));
    }
}


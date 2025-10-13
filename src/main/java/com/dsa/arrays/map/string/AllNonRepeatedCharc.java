package com.dsa.arrays.map.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AllNonRepeatedCharc {
    public static void main(String[] args) {
        String str = "hello world java hello code world";

        System.out.println("Classic Approach:");
        allNonRepeatedWords(str);

        System.out.println("\nJava 8 Stream Approach:");
        allNonRepeatedWordsJava8(str);
    }

    // ✅ Classic version
    private static void allNonRepeatedWords(String str) {
        String[] words = str.toLowerCase().split("\\s+");
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) { // ✅ non-repeated condition
                System.out.println(entry.getKey());
            }
        }
    }

    // ✅ Java 8 Stream version
    private static void allNonRepeatedWordsJava8(String str) {
        Arrays.stream(str.toLowerCase().split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1) // ✅ non-repeated condition
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}

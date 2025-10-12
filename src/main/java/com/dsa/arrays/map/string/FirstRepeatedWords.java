package com.dsa.arrays.map.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedWords {
    public static void main(String[] args) {
        String str = "Java is fun and java is popular";

        System.out.println("Classic: " + firstRepeatedWords(str));
        System.out.println("Java 8: " + firstRepeatedWordsJava8(str));
    }

    // ✅ Classic version using LinkedHashMap (preserves order)
    private static String firstRepeatedWords(String str) {
        String[] words = str.toLowerCase().split("\\s+");
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1)
                return entry.getKey();
        }

        return "No repeated word found";
    }

    // ✅ Java 8 Stream version
    private static String firstRepeatedWordsJava8(String str) {
        String[] words = str.toLowerCase().split("\\s+");

        Map<String, Long> freqMap = Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        return freqMap.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse("No repeated word found");
    }
}

package com.dsa.arrays.map.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedWord {
    public static void main(String[] args) {
        String str = "java is fun and java is popular";

        System.out.println("Classic Approach: " + firstNonRepeatedWord(str));
        System.out.println("Java 8 Stream Approach: " + firstNonRepeatedWordJava8(str));
    }

    // ✅ Classic Approach
    private static String firstNonRepeatedWord(String str) {
        // Normalize input (lowercase + remove punctuation)
        str = str.toLowerCase().replaceAll("[^a-z0-9\\s]", "");

        String[] words = str.split("\\s+");
        Map<String, Integer> map = new LinkedHashMap<>(); // preserve insertion order

        // Count frequency of each word
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Find first word with frequency 1
        for (String word : words) {
            if (map.get(word) == 1) {
                return word; // ✅ Return immediately once found
            }
        }

        return "No non-repeated word found";
    }

    // ✅ Java 8 Stream Approach
    private static String firstNonRepeatedWordJava8(String str) {
        return Arrays.stream(
                        str.toLowerCase()
                                .replaceAll("[^a-z0-9\\s]", "")
                                .split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse("No non-repeated word found");
    }
}

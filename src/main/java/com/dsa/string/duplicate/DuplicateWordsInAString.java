package com.dsa.string.duplicate;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordsInAString {
    public static void main(String[] args) {
        String str = "This is new word in This new word";

        System.out.println("Classic Approach:");
        duplicateWordsClassic(str);

        System.out.println("\nJava 8 Stream Approach:");
        duplicateWordsJava8(str);
    }

    // ✅ Classic Approach
    private static void duplicateWordsClassic(String str) {
        str = str.toLowerCase().replaceAll("[^a-z\\s]", ""); // remove punctuation, normalize case
        String[] words = str.split("\\s+");

        Map<String, Integer> map = new LinkedHashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        boolean found = false;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " → " + entry.getValue());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No duplicate words found");
        }
    }

    // ✅ Java 8 Stream Approach
    private static void duplicateWordsJava8(String str) {
        str = str.toLowerCase().replaceAll("[^a-z\\s]", "");

        Map<String, Long> freqMap = Arrays.stream(str.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        List<String> duplicates = freqMap.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate words found");
        } else {
            duplicates.forEach(System.out::println);
        }
    }
}

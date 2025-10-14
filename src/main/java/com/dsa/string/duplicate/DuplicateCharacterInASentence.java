package com.dsa.string.duplicate;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacterInASentence {
    public static void main(String[] args) {
        String str = "Java Developer";

        System.out.println("Classic Approach:");
        String result = duplicatesChars(str);
        System.out.println("Duplicates: " + result);

        System.out.println("\nJava 8 Stream Approach:");
        String results = duplicatesCharsJava8(str);
        System.out.println("Duplicates: " + results);
    }

    // ✅ Classic Approach
    private static String duplicatesChars(String str) {
        str = str.toLowerCase().replaceAll("\\s+", ""); // normalize input
        Set<Character> seen = new HashSet<>();
        Set<Character> dup = new LinkedHashSet<>(); // preserve order

        for (char c : str.toCharArray()) {
            if (!seen.add(c)) {
                dup.add(c);
            }
        }

        return dup.isEmpty() ? "No Duplicates" : dup.toString();
    }

    // ✅ Java 8 Stream Approach
    private static String duplicatesCharsJava8(String str) {
        str = str.toLowerCase().replaceAll("\\s+", ""); // normalize input

        // Step 1: Group by character and count frequency
        Map<Character, Long> freqMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        // Step 2: Filter only characters with count > 1 (duplicates)
        List<Character> duplicates = freqMap.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return duplicates.isEmpty() ? "No Duplicates" : duplicates.toString();
    }
}

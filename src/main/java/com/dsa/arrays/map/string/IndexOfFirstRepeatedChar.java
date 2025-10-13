package com.dsa.arrays.map.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IndexOfFirstRepeatedChar {
    public static void main(String[] args) {
        String str = "programming";

        System.out.println("Classic Approach: " + indexOfFirstRepeatedChar(str));
        System.out.println("Java 8 Stream Approach: " + indexOfFirstRepeatedCharJava8(str));
    }

    // ✅ Classic Approach
    private static int indexOfFirstRepeatedChar(String str) {
        str = str.toLowerCase();
        Set<Character> seen = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (seen.contains(c)) {
                return i; // first repeated character’s index
            }
            seen.add(c);
        }
        return -1; // no repeated character
    }

    // ✅ Java 8 Stream Approach (returns index)
    private static int indexOfFirstRepeatedCharJava8(String str) {
        str = str.toLowerCase();

        // Count character frequencies
        Map<Character, Long> freqMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        // Find first repeated char (freq > 1)
        Optional<Character> firstRepeated = freqMap.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst();

        String finalStr = str;
        return firstRepeated.map(ch -> finalStr.indexOf(ch, finalStr.indexOf(ch) + 1)).orElse(-1);
    }
}

package com.dsa.arrays.map.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
//TODO: 4
public class IndexOfFirstRepeatedChar {
    public static void main(String[] args) {
        String str = "programming";

        System.out.println("Classic Approach: " + indexOfFirstRepeatedChar(str));
        System.out.println("Java 8 Stream Approach: " + indexOfFirstRepeatedCharJava8(str));
    }

    // ✅ Classic Approach
    // ✅ Classic Approach using Map
    private static int indexOfFirstRepeatedChar(String str) {
        str = str.toLowerCase();
        Map<Character, Boolean> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (map.containsKey(c)) {
                return i; // this is the first repeated character index
            }

            map.put(c, true); // mark character as seen
        }

        return -1; // no repeated character found
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

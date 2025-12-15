package com.dsa.arrays.map.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
//TODO: 3
public class IndexOfFirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "swiss";

        System.out.println("Classic Approach: " + indexOfFirstNonRepeatedChar(str));
        System.out.println("Java 8 Stream Approach: " + indexOfFirstNonRepeatedCharJava8(str));
    }

    // ✅ Classic Approach
    private static int indexOfFirstNonRepeatedChar(String str) {
        str = str.toLowerCase();
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Count frequency of each character
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find the first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                return i; // return its index
            }
        }

        return -1; // if none found
    }

    // ✅ Java 8 Stream Approach
    private static int indexOfFirstNonRepeatedCharJava8(String str) {
        str = str.toLowerCase();

        Map<Character, Long> freqMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        Optional<Character> first = freqMap.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        String finalStr = str;
        return first.map(ch -> finalStr.indexOf(ch)).orElse(-1);
    }
}

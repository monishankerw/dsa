package com.dsa.arrays.map.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AllNonRepeatingChar {
    public static void main(String[] args) {
        String str = "hello world java";

        System.out.println("Classic Approach: " + allNonRepeatedChars(str));
        System.out.println("Java 8 Stream Approach: " + allNonRepeatedCharsJava(str));
    }

    // ✅ Classic approach using HashMap
    private static List<Character> allNonRepeatedChars(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            // ignore spaces
            if (c != ' ')
                map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> result = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                result.add(entry.getKey());
        }

        return result;
    }

    // ✅ Java 8 Stream approach
    private static List<Character> allNonRepeatedCharsJava(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ') // ignore spaces
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}

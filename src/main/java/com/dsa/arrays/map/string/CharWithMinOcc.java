package com.dsa.arrays.map.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharWithMinOcc {
    public static void main(String[] args) {
        String str = "successfully";

        System.out.println("Classic Approach: " + charWithMinOcc(str));
        System.out.println("Java 8 Stream Approach: " + charWithMinOccJava8(str));
    }

    // ✅ Classic Map-based approach
    private static char charWithMinOcc(String str) {
        str = str.toLowerCase().replaceAll("\\s+", ""); // normalize input

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char minChar = 0;
        int minCount = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() < minCount) {
                minCount = entry.getValue();
                minChar = entry.getKey();
            }
        }

        return minChar;
    }

    // ✅ Java 8 Stream-based approach
    private static char charWithMinOccJava8(String str) {
        return new String(str.toLowerCase().replaceAll("\\s+", ""))
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .min(Map.Entry.comparingByValue()) // find min by occurrence
                .map(Map.Entry::getKey)
                .orElse(' ');
    }
}

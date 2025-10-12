package com.dsa.arrays.map.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepeatingChars {
    public static void main(String[] args) {
        String str = "swiss";
        String result = firstNonRepeatingChars(str);
        System.out.println("First non-repeating character: " + result);
        String results = String.valueOf(firstNonRepeatingCharsJava8(str));
        System.out.println("First non-repeating character: " + results);
    }


    private static String firstNonRepeatingChars(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Step 1: Count frequency of each character
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Return first character with count == 1
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return String.valueOf(entry.getKey());
            }
        }

        return "No Non-Repeating Character";
    }

    private static Optional<String> firstNonRepeatingCharsJava8(String str) {
        return str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet()
                .stream().filter(e -> e.getValue() == 1)
                .map(e -> String.valueOf(e.getKey())).findFirst();
    }

}

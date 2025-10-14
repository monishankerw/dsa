package com.dsa.string.basics;

import java.util.*;
import java.util.stream.Collectors;

public class VowelCon {
    public static void main(String[] args) {
        String text = "Test Engin";

        System.out.println("Classic Approach:");
        countVowelsAndConsonants(text);

        System.out.println("\nJava 8 Stream Approach:");
        countVowelsAndConsonantsJava8(text);
    }

    // ✅ Classic Approach
    private static void countVowelsAndConsonants(String text) {
        text = text.toLowerCase().replaceAll("[^a-z]", ""); // remove non-letters

        int vowels = 0, consonants = 0;
        for (char c : text.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // ✅ Java 8 Stream Approach
    private static void countVowelsAndConsonantsJava8(String text) {
        text = text.toLowerCase().replaceAll("[^a-z]", "");

        Map<String, Long> result = text.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> "aeiou".indexOf(c) != -1 ? "Vowels" : "Consonants",
                        Collectors.counting()
                ));

        System.out.println(result);
    }
}

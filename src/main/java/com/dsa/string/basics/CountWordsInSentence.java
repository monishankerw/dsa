package com.dsa.string.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountWordsInSentence {
    public static void main(String[] args) {
        String str = "Java is testing java is";

        System.out.println("Original Sentence: " + str);

        // 1️⃣ Reverse words using Java 8
        String reversed = reverseWordsWithJava8(str);
        System.out.println("Reversed Sentence: " + reversed);

        // 2️⃣ Count words without Java 8
        int count1 = countWordsWithoutJava8(str);
        System.out.println("Word Count (Without Java 8): " + count1);

        // 3️⃣ Count words using Java 8
        long count2 = countWordsWithJava8(str);
        System.out.println("Word Count (With Java 8): " + count2);
    }

    // ✅ Reverse words using Java 8 (Collections)
    private static String reverseWordsWithJava8(String str) {
        List<String> words = Arrays.asList(str.split("\\s+"));
        Collections.reverse(words);
        return String.join(" ", words);
    }

    // ✅ Count words manually (no Java 8)
    private static int countWordsWithoutJava8(String str) {
        str = str.trim();
        if (str.isEmpty()) return 0;

        int count = 1; // At least one word
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }
        return count;
    }

    // ✅ Count words using Java 8 Stream API
    private static long countWordsWithJava8(String str) {
        return Arrays.stream(str.trim().split("\\s+")).count();
    }
}

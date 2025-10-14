package com.dsa.string;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String str = "My name is ABC";

        System.out.println("Classic Approach:");
        reverseWord(str);

        System.out.println("\nJava 8 Stream Approach:");
        reverseWordJava8(str);
    }

    // ✅ Classic Approach
    private static void reverseWord(String str) {
        String[] words = str.split(" ");
        String rev = "";
        for (int i = words.length - 1; i >= 0; i--) {
            rev += words[i] + " ";
        }
        System.out.println(rev.trim());
    }

    // ✅ Java 8 Stream Approach
    private static void reverseWordJava8(String str) {
        String reversed = Arrays.stream(str.split(" "))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return String.join(" ", list);
                        }
                ));
        System.out.println(reversed);
    }
}
